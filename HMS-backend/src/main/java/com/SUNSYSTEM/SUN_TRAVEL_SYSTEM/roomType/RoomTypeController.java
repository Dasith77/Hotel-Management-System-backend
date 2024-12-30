package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/roomType")
@CrossOrigin("http://localhost:4200/")

public class RoomTypeController
{
    private final RoomTypeService roomTypeService;

    @Autowired
    public RoomTypeController( RoomTypeService roomTypeService )
    {
        this.roomTypeService = roomTypeService;
    }
//    @GetMapping
//    public List<RoomType> getRoomType(){
//        return roomTypeService.getType();
//    }

    @PostMapping
    public void registerNewType( @RequestBody RoomType roomType ){
        roomTypeService.addNewType( roomType );
    }
}
