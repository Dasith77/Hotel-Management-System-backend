package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails;


import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomDetailsDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/roomDetails")
@CrossOrigin("http://localhost:4200/")

public class RoomDetailsController
{
    private final RoomDetailsService roomDetailsService;

    @Autowired
    public RoomDetailsController( RoomDetailsService roomDetailsService )
    {
        this.roomDetailsService = roomDetailsService;
    }
    @GetMapping
    public List<RoomDetails> getRoomDetails(){
        return roomDetailsService.getRooms();
}
    @PostMapping
    public void registerNewRooms( @RequestBody RoomDetailsDTO roomDetailsDTO, Hotel hotel ){
        roomDetailsService.addNewRoom(hotel,roomDetailsDTO);
    }




}
