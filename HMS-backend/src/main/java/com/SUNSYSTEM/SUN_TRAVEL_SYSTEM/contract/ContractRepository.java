package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    void deleteContractByContractId( Integer contractId);

    @Query("SELECT c FROM Contract c WHERE c.startDate <= :arriveDate AND c.endDate >= :departureDate")
    List<Contract> findValidContracts( LocalDate arriveDate, LocalDate departureDate );

    Optional<Contract> findByHotel( Hotel hotel);



    //    @Query("SELECT c FROM Contract c WHERE c.hotelId = ?1")
//    Optional<Contract> findContractByHotelIdQuery( Long hotelId );
}
