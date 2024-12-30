package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract.Contract;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails.RoomDetails;

import java.util.List;

public class ContractViewDTO
{
    private Contract contract;
    private Hotel hotel;
    private List<RoomDetails> roomDetailsList;

    public ContractViewDTO( Contract contract, Hotel hotel, List<RoomDetails> roomDetailsList )
    {
        this.contract = contract;
        this.hotel = hotel;
        this.roomDetailsList = roomDetailsList;
    }

    public Contract getContract()
    {
        return contract;
    }

    public void setContract( Contract contract )
    {
        this.contract = contract;
    }

    public Hotel getHotel()
    {
        return hotel;
    }

    public void setHotel( Hotel hotel )
    {
        this.hotel = hotel;
    }

    public List<RoomDetails> getRoomDetailsList()
    {
        return roomDetailsList;
    }

    public void setRoomDetailsList( List<RoomDetails> roomDetailsList )
    {
        this.roomDetailsList = roomDetailsList;
    }
}
