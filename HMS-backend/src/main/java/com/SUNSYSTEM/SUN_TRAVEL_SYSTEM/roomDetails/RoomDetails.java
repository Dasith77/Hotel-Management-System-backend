package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType.RoomType;
import jakarta.persistence.*;

@Entity
@Table
public class RoomDetails
{
    @Id
    @SequenceGenerator(
            name="room details_sequence",
                              sequenceName = "room details_sequence",
                              allocationSize=1,
                              initialValue=2000
    )
    @GeneratedValue(
            strategy= GenerationType.SEQUENCE,
                           generator = "room details_sequence"
    )
    private Integer roomDetId;

    @ManyToOne
    @JoinColumn(name="roomTypeId")
    private RoomType type;
    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel hotel;
    private Double pricePerPerson;
    private Integer noOfRooms;
    private Integer maxAdults;

    public RoomDetails( Integer roomDetId, RoomType type, Hotel hotel, Double pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
        this.roomDetId = roomDetId;
        this.type = type;
        this.hotel = hotel;
        this.pricePerPerson = pricePerPerson;
        this.noOfRooms = noOfRooms;
        this.maxAdults = maxAdults;
    }

    public RoomDetails( RoomType type, Hotel hotel, Double pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
        this.type = type;
        this.hotel = hotel;
        this.pricePerPerson = pricePerPerson;
        this.noOfRooms = noOfRooms;
        this.maxAdults = maxAdults;
    }

    public RoomDetails()
    {
    }
    public RoomDetails( String type, Integer pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
    }

    public RoomDetails( Integer pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
    }

    public RoomDetails(String type,Hotel hotel, Integer pricePerPerson, Integer noOfRooms, Integer maxAdults )
    {
    }

    public Integer getRoomDetId()
    {
        return roomDetId;
    }

    public void setRoomDetId( Integer roomDetId )
    {
        this.roomDetId = roomDetId;
    }

    public RoomType getType()
    {
        return type;
    }

    public void setType( RoomType type )
    {
        this.type = type;
    }

    public Hotel getHotel()
    {
        return hotel;
    }

    public void setHotel( Hotel hotel )
    {
        this.hotel = hotel;
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

    @Override
    public String toString()
    {
        return "RoomDetails{" +
                       "roomDetId=" + roomDetId +
                       ", type=" + type +
                       ", hotel=" + hotel +
                       ", pricePerPerson=" + pricePerPerson +
                       ", noOfRooms=" + noOfRooms +
                       ", maxAdults=" + maxAdults +
                       '}';
    }
}
