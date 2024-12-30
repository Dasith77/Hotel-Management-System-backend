package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel;


import jakarta.persistence.*;

@Entity
@Table
public class Hotel {
    @Id
    @SequenceGenerator(
            name="hotel_squence",
            sequenceName="hotel_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "hotel_sequence"
    )

    private Integer hotelId;
    private String hotelName;
    private String location;
    private String contactNumber;

    public Hotel() {
    }

    public Hotel( Integer hotelId, String hotelName, String location, String contactNumber) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.location = location;
        this.contactNumber = contactNumber;
    }
    //without ID

    public Hotel( String hotelName, String location, String contactNumber) {
        this.hotelName = hotelName;
        this.location = location;
        this.contactNumber = contactNumber;
    }

    //getters and setters

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId( Integer hotelId ) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber( String contactNumber) {
        this.contactNumber = contactNumber;
    }


    //for human readable representation of "Hotel" objects
    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", location='" + location + '\'' +
                ", contactNumber=" + contactNumber +
                '}';
    }
}
