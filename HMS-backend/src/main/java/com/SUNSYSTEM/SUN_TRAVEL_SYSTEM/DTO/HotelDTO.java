package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

public class HotelDTO
{
    private String hotelName;
    private String location;
    private String contactNumber;

    public HotelDTO( String hotelName, String location, String contactNumber )
    {
        this.hotelName = hotelName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    public String getHotelName()
    {
        return hotelName;
    }

    public void setHotelName( String hotelName )
    {
        this.hotelName = hotelName;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation( String location )
    {
        this.location = location;
    }

    public String getContactNumber()
    {
        return contactNumber;
    }

    public void setContactNumber( String contactNumber )
    {
        this.contactNumber = contactNumber;
    }
}
