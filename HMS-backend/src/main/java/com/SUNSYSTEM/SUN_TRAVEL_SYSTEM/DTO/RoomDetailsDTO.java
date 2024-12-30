package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

public class RoomDetailsDTO
{
    private String type;
    private Double pricePerPerson;
    private Integer noOfRooms;
    private Integer maxAdults;

    public RoomDetailsDTO( String type, Double pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
        this.type = type;
        this.pricePerPerson = pricePerPerson;
        this.noOfRooms = noOfRooms;
        this.maxAdults = maxAdults;
    }

    public RoomDetailsDTO()
    {
    }

    public String getType()
    {
        return type;
    }

    public void setType( String type )
    {
        this.type = type;
    }

    public Double getPricePerPerson()
    {
        return pricePerPerson;
    }

    public void setPricePerPerson( Double pricePerPerson )
    {
        this.pricePerPerson = pricePerPerson;
    }

    public Integer getNoOfRooms()
    {
        return noOfRooms;
    }

    public void setNoOfRooms( Integer noOfRooms )
    {
        this.noOfRooms = noOfRooms;
    }

    public Integer getMaxAdults()
    {
        return maxAdults;
    }

    public void setMaxAdults( Integer maxAdults )
    {
        this.maxAdults = maxAdults;
    }
}
