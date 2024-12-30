package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.search;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.SearchDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.SearchResultsDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.Contract;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.ContractService;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



@Service
public class SearchService
{
    private final ContractService contractService;

    private  final RoomDetailsService roomDetailsService;

    @Autowired
    public SearchService( ContractService contractService, RoomDetailsService roomDetailsService )
    {
        this.contractService = contractService;
        this.roomDetailsService = roomDetailsService;
    }

    public List<SearchResultsDTO> getAvailableRooms( SearchDTO searchDTO )
    {
        List<SearchResultsDTO> searchResultsDTOS= new ArrayList<>();
        LocalDate checkOut = searchDTO.getCheckInDate().plusDays( searchDTO.getNumOfNights() );
        System.out.println( "came to getAvailableRooms" );
        List<Contract> validContractList = contractService.findValidContractsForDates( searchDTO.getCheckInDate(), checkOut );
        for( Contract contract : validContractList )
        {

//            System.out.println( contract.getContractId() );
            searchResultsDTOS.add(roomDetailsService.findSuitableRooms(contract.getHotel(),searchDTO.getRoomReqDTOS(), searchDTO.getMarkup() ) );
            //for every contract find the suitable rooms
            //send Hotel hotel , List<RoomReqDTO> roomReqDTOList   to findSuitableRooms function in RoomDetailsService

        }

        return searchResultsDTOS;


    }}


