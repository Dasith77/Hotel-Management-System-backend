package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.contract;


import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.agent.Agent;
import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel.Hotel;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

//import java.time.LocalDate;

@Entity
@Table
public class Contract
{
    @Id
    @SequenceGenerator(
            name="contract_sequence",
            sequenceName="contract_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy =  GenerationType.SEQUENCE,
            generator = "contract_sequence"
    )
   private Integer contractId;


    @OneToOne
    @JoinColumn(name="hotelId")
    private Hotel hotel;
    private LocalDate startDate;
    private LocalDate endDate;

    public Integer getContractId()
    {
        return contractId;
    }

    public void setContractId( Integer contractId )
    {
        this.contractId = contractId;
    }

    public Hotel getHotel()
    {
        return hotel;
    }

    public void setHotel( Hotel hotel )
    {
        this.hotel = hotel;
    }

    public LocalDate getStartDate()
    {
        return startDate;
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

    public Contract( Hotel hotel, Float markup, LocalDate startDate, LocalDate endDate )
    {
    }



    public Contract( Integer contractId, Hotel hotel, LocalDate startDate, LocalDate endDate )
    {
        this.contractId = contractId;
//        this.agent = agent;
        this.hotel = hotel;
        this.startDate = startDate;
        this.endDate = endDate;
    }
//
    public Contract(Hotel hotel, LocalDate startDate, LocalDate endDate )
    {
//        this.agent = agent;
        this.hotel = hotel;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Contract()
    {
    }



  @Override
  public String toString()
 {
       return "Contract{" +
                       "contractId=" + contractId +
                       ", hotel=" + hotel +
                      ", startDate=" + startDate +
                      ", endDate=" + endDate +
                      '}';
   }
}
