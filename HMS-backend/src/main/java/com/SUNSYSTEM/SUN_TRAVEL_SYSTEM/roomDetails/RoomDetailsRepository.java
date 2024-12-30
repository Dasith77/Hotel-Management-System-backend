package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomDetails;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.RoomReqDTO;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomDetailsRepository extends JpaRepository<RoomDetails,Integer>
{
    void deleteRoomByRoomDetId( int roomDetId );

    @Query(value="SELECT rd FROM RoomDetails rd "+
                         "WHERE rd.hotel = :hotel "+
                         "AND rd.maxAdults >= :max_num_adults "+
                         "AND rd.noOfRooms>= :tot_rooms")
    List<RoomDetails> findRoomDet( @Param( "hotel" ) Hotel hotel,@Param( "max_num_adults" ) Integer max_num_adults, @Param( "tot_rooms" ) Integer tot_rooms );


    @Query("SELECT rd FROM RoomDetails rd WHERE rd.hotel = :hotel")
    List<RoomDetails> getRoomViewRepo(@Param("hotel") Hotel hotel);








}
//    @Query("SELECT s FROM RoomDetails s WHERE s.roomDetId=?1")
//    Optional<RoomDetails> findRoomByRoomDetId(int roomDetId);







