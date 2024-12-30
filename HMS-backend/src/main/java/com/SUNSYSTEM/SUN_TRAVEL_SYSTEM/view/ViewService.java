package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.view;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.ContractViewDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.Contract;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.ContractService;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.HotelService;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetails;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetailsRepository;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ViewService
{
    private final ContractService contractService;
    private HotelService hotelService;
    private final RoomDetailsService roomDetailsService;
    private RoomDetailsRepository roomDetailsRepository;

    @Autowired
    public ViewService( ContractService contractService, HotelService hotelService, RoomDetailsService roomDetailsService )
    {
        this.contractService = contractService;
        this.hotelService = hotelService;
        this.roomDetailsService = roomDetailsService;
    }


    public List<ContractViewDTO> getAllcontractDetails(){
        List<Contract> contracts = contractService.getContracts();
        //List<Hotel> hotels = hotelService.getHotels();
        //List<RoomDetails> roomDetailsList = roomDetailsService.getRooms();

        List<ContractViewDTO> resultedViews = new ArrayList<>();
        for(Contract contract:contracts){
            ContractViewDTO a = new ContractViewDTO( contract,contract.getHotel(),roomDetailsService.getRoomView( contract.getHotel() ));
            resultedViews.add( a);
        }

        return resultedViews;
    }





}
