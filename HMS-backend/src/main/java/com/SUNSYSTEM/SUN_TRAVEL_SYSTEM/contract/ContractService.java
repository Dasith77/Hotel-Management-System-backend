package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.ContractDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomDetailsDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.HotelService;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ContractService {
    private final ContractRepository contractRepository;
    private final HotelService hotelService;
    private final  RoomDetailsService roomDetailsService;

    @Autowired
    public ContractService( ContractRepository contractRepository, HotelService hotelService, RoomDetailsService roomDetailsService ) {
        this.contractRepository = contractRepository;
        this.hotelService = hotelService;
        this.roomDetailsService = roomDetailsService;
    }

    public List<Contract> getContracts() {
        return contractRepository.findAll();
    }

    public Boolean addNewContract( ContractDTO contractDTO) {
        Hotel hotel = new Hotel();
        if( hotelService.getHotelbyId( contractDTO.getHotelId() ).isPresent() )
        {
            hotel = hotelService.getHotelbyId( contractDTO.getHotelId() ).get();

        }
        Contract contract= convertContractDTO(contractDTO,hotel);
        if(contractRepository.findByHotel( hotel ).isPresent()){
            Contract contract1=contractRepository.findByHotel( hotel ).get();
            contractRepository.delete( contract1 );
        }
        //finally all contracts will save here
        contract=contractRepository.save(contract);
        List<RoomDetailsDTO> roomDetailsDTOList = contractDTO.getRoomDetailsDTOList();

        if(roomDetailsDTOList!=null){
            System.out.println(roomDetailsDTOList);

            for(RoomDetailsDTO roomDetailsDTO:roomDetailsDTOList){
                System.out.println("came to not null room details.............");

                roomDetailsService.addNewRoom(hotel, roomDetailsDTO );
            }
        }
        return true;
    }

    private Contract convertContractDTO( ContractDTO contractDTO,Hotel hotel )
    {

        //return new contract object with including 4 info(hotel,markup,start,end)
        return new Contract(hotel,
                contractDTO.getStartDate(),
                contractDTO.getEndDate()
                );
    }
    public List<Contract> findValidContractsForDates(LocalDate arriveDate, LocalDate departureDate) {
        return contractRepository.findValidContracts(arriveDate, departureDate);

    }




}
