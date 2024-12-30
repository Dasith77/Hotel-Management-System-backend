package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomDetailsDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomReqDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomTypeDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.SearchResultsDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType.RoomType;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RoomDetailsService
{
    private final RoomDetailsRepository roomDetailsRepository;
    private final RoomTypeService roomTypeService;
    @Autowired
    public RoomDetailsService( RoomDetailsRepository roomDetailsRepository, RoomTypeService roomTypeService )
    {
        this.roomDetailsRepository = roomDetailsRepository;
        this.roomTypeService = roomTypeService;
    }
    public List<RoomDetails> getRooms(){
        return roomDetailsRepository.findAll();
}
    public void addNewRoom( Hotel hotel, RoomDetailsDTO roomDetailsDTO){
        //convert RoomDetailsDTO to RoomDetails
        RoomType roomType=new RoomType();
        roomType.setType( roomDetailsDTO.getType() );
        roomTypeService.addNewType( roomType );
        RoomDetails roomDetails = convertRoomDetailDTO( hotel,roomDetailsDTO,roomType);
        //roomDetails.setRoomType( roomType );

        roomDetails=roomDetailsRepository.save(roomDetails);
    }

    public SearchResultsDTO findSuitableRooms( Hotel hotel , List<RoomReqDTO> roomReqDTOList , Double markup)
    {
        Integer max_num_adults = 0;
        Integer tot_rooms = 0;
        Integer tot_adults = 0;
        Double min_price = 0.0;
        for( RoomReqDTO roomReqDTO : roomReqDTOList )
        {
            //find the max of max adults
            Integer num_adults = roomReqDTO.getNumOfAdults();
            if( num_adults > max_num_adults )
            {
                max_num_adults = num_adults;
            }
            //find the total rooms
            tot_rooms += roomReqDTO.getNumOfRooms();
            //find the total aaults
            tot_adults += roomReqDTO.getNumOfAdults();
        }
        //ask for roomsDetails list with maxadults>=max and no.of rooms>=total rooms
        List<RoomDetails> for_hotel = roomDetailsRepository.getRoomViewRepo( hotel );



        List<RoomDetails> valid_roomDet_rows = roomDetailsRepository.findRoomDet( hotel, max_num_adults, tot_rooms );
        List<Double> price_list = new ArrayList<>();
        List<RoomType> roomTypes = new ArrayList<>();
        for( RoomDetails roomDetails : valid_roomDet_rows )
        {
            price_list.add( roomDetails.getPricePerPerson() );
        }
        min_price = Collections.min( price_list );
        for( RoomDetails roomDetails : valid_roomDet_rows )
        {
            roomTypes.add( roomDetails.getType() );
        }

        Double final_price = (min_price*tot_adults)+((min_price*tot_adults)*(markup/100));
        return new SearchResultsDTO( final_price, roomTypes, hotel );
    }



        //create searchResultsDTO and return




    private RoomDetails convertRoomDetailDTO( Hotel hotel,RoomDetailsDTO roomDetailsDTO,RoomType roomType )
    {
        //System.out.println("----------"+roomDetailsDTO.getPricePerPerson());
        return new RoomDetails(
                roomType,
                hotel,
                roomDetailsDTO.getPricePerPerson(),
                roomDetailsDTO.getNoOfRooms(),
                roomDetailsDTO.getMaxAdults());
    }

    public List<RoomDetails> getRoomView( Hotel hotel )
    {
        return roomDetailsRepository.getRoomViewRepo( hotel );
    }
}