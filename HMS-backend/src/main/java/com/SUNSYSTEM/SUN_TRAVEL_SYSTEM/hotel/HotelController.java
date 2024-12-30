package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.HotelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/hotel")
@CrossOrigin("http://localhost:4200/")

public class HotelController {

   private final HotelService hotelService;

   @Autowired
   public HotelController(HotelService hotelService){

       this.hotelService=hotelService;
   }

    //entire design pattern
    @GetMapping   //rest end point
    public List<Hotel> getHotels(){
        return hotelService.getHotels();

    }
    @PostMapping()
    public void registerNewHotel(@RequestBody Hotel hotel){

       hotelService.addNewHotel(hotel);
    }





}
