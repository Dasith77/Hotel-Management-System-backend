package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomDetailsDTO;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

public class ContractDTO
{


    public Integer getHotelId()
    {
        return hotelId;
    }

    public void setHotelId( Integer hotelId )
    {
        this.hotelId = hotelId;
    }

    public void setMarkup( Float markup )
    {
        this.markup = markup;
    }
    private Integer hotelId;
    private LocalDate startDate;
    private LocalDate endDate;

    private Float markup;
    private List<RoomDetailsDTO> roomDetailsDTOList;

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public ContractDTO()
    {
    }

    public ContractDTO( Integer hotelId, LocalDate startDate, LocalDate endDate, Float markup, List<RoomDetailsDTO> roomDetailsDTOList )
    {
        this.hotelId = hotelId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.markup = markup;
        this.roomDetailsDTOList = roomDetailsDTOList;
    }

    public ContractDTO( LocalDate startDate, LocalDate endDate, Float markup, List<RoomDetailsDTO> roomDetailsDTOList )
    {
        this.startDate = startDate;
        this.endDate = endDate;
        this.markup = markup;
        this.roomDetailsDTOList = roomDetailsDTOList;
    }

    public void setStartDate( LocalDate startDate )
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate( LocalDate endDate )
    {
        this.endDate = endDate;
    }

    public float getMarkup()
    {
        return markup;
    }

    public void setMarkup( float markup )
    {
        this.markup = markup;
    }

    public List<RoomDetailsDTO> getRoomDetailsDTOList()
    {
        return roomDetailsDTOList;
    }

    public void setRoomDetailsDTOList( List<RoomDetailsDTO> roomDetailsDTOList )
    {
        this.roomDetailsDTOList = roomDetailsDTOList;
    }
}
