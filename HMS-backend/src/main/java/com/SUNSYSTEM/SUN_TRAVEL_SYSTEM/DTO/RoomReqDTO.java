package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

public class RoomReqDTO
{
    private Integer numOfAdults;
    private Integer numOfRooms;

    public RoomReqDTO( Integer numOfAdults, Integer numOfRooms )
    {
        this.numOfAdults = numOfAdults;
        this.numOfRooms = numOfRooms;
    }

    public Integer getNumOfAdults()
    {
        return numOfAdults;
    }

    public void setNumOfAdults( Integer numOfAdults )
    {
        this.numOfAdults = numOfAdults;
    }

    public Integer getNumOfRooms()
    {
        return numOfRooms;
    }

    public void setNumOfRooms( Integer numOfRooms )
    {
        this.numOfRooms = numOfRooms;
    }
}
