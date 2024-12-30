package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.RoomReq;

import org.springframework.web.bind.annotation.PostMapping;

public class RoomReqController
{
    private final RoomReqRepository roomReqRepository;

    public RoomReqController( RoomReqRepository roomReqRepository )
    {
        this.roomReqRepository = roomReqRepository;
    }

}
