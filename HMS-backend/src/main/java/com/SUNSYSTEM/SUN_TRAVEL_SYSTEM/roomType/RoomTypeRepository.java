package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.roomType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RoomTypeRepository extends JpaRepository<RoomType,Integer>{
    //void deleteTypeByName(String roomType);

    @Query("SELECT s FROM RoomType s WHERE s.type=?1")
    Optional<RoomType> findTypeByName(String type);
}
