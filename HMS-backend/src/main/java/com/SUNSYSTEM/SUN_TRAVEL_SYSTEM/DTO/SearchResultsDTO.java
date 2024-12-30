package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType.RoomType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class SearchResultsDTO
{
    private Double minPrice;
    private List<RoomType> roomTypes;
    private Hotel hotel;

    public SearchResultsDTO( Double minPrice, List<RoomType> roomTypes, Hotel hotel )
    {
        this.minPrice = minPrice;
        this.roomTypes = roomTypes;
        this.hotel = hotel;
    }

    public Double getMinPrice()
    {
        return minPrice;
    }

    public void setMinPrice( Double minPrice )
    {
        this.minPrice = minPrice;
    }

    public List<RoomType> getRoomTypes()
    {
        return roomTypes;
    }

    public void setRoomTypes( List<RoomType> roomTypes )
    {
        this.roomTypes = roomTypes;
    }

    public Hotel getHotel()
    {
        return hotel;
    }

    public void setHotel( Hotel hotel )
    {
        this.hotel = hotel;
    }
}
