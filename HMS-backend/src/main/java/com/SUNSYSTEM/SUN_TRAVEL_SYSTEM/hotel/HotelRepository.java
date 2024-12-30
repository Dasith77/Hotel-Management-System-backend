package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository     //responsible for data access
public interface HotelRepository extends JpaRepository <Hotel,Integer>{
//    void deleteHotelByhotelId(int hotelId);
    @Query("SELECT s FROM Hotel s WHERE s.hotelName=?1")
    Optional<Hotel> findHotelByhotelName(String hotelName);
}
