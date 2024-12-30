package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomTypeService
{
    private final RoomTypeRepository roomTypeRepository;

    @Autowired
    public RoomTypeService( RoomTypeRepository roomTypeRepository )
    {
        this.roomTypeRepository=roomTypeRepository;
    }
    public List<RoomType> getType(RoomType roomType)
    {

        return roomTypeRepository.findAll();
    }
    public void addNewType(RoomType roomType){

        roomTypeRepository.save( roomType );
    }
}
