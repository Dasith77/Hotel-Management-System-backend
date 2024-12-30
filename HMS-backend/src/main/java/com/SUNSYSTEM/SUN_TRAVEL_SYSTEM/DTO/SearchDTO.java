package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO;

import java.time.LocalDate;
import java.util.List;

public class SearchDTO
{
   private LocalDate checkInDate;
   private Integer numOfNights;
   private List<RoomReqDTO>roomReqDTOS;

   private Double markup;

   public SearchDTO( LocalDate checkInDate, Integer numOfNights, List<RoomReqDTO> roomReqDTOS, Double markup )
   {
      this.checkInDate = checkInDate;
      this.numOfNights = numOfNights;
      this.roomReqDTOS = roomReqDTOS;
      this.markup = markup;
   }

//   public SearchDTO( LocalDate checkInDate, Integer numOfNights, List<RoomReqDTO> roomReqDTOS  )
//   {
//      this.checkInDate = checkInDate;
//      this.numOfNights = numOfNights;
//      this.roomReqDTOS = roomReqDTOS;
//   }

   public Double getMarkup()
   {
      return markup;
   }

   public void setMarkup( Double markup )
   {
      this.markup = markup;
   }

   public LocalDate getCheckInDate()
   {
      return checkInDate;
   }

   public void setCheckInDate( LocalDate checkInDate )
   {
      this.checkInDate = checkInDate;
   }

   public Integer getNumOfNights()
   {
      return numOfNights;
   }

   public void setNumOfNights( Integer numOfNights )
   {
      this.numOfNights = numOfNights;
   }

   public List<RoomReqDTO> getRoomReqDTOS()
   {
      return roomReqDTOS;
   }

   public void setRoomReqDTOS( List<RoomReqDTO> roomReqDTOS )
   {
      this.roomReqDTOS = roomReqDTOS;
   }
}
