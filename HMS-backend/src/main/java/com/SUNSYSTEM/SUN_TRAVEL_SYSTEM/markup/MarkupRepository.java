package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.markup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MarkupRepository extends JpaRepository<Markup,Integer>{
    //void deleteTypeByName(String roomType);

    @Query("SELECT s FROM Markup s WHERE s.value=?1")
    Optional<Markup> findValue( Integer value);
}
