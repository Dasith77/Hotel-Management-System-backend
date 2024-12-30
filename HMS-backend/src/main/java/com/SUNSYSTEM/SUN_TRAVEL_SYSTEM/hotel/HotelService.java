package com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.hotel;

import com.SUNSYSTEM.SUN_TRAVEL_SYSTEM.DTO.HotelDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;
    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getHotels(){
        return hotelRepository.findAll();
    }
    public void addNewHotel( Hotel hotel){
        //hotel.setHotelId(UUID.randomUUID.toString());
//        Optional<Hotel> hotelOptional = hotelRepository.findHotelByhotelName(hotel.getHotelName());
//        if(hotelOptional.isPresent()){
//            throw new IllegalStateException("name taken");
//        }
        //Hotel hotel = convertHotelDTO(hotelDTO);

        hotelRepository.save(hotel);
    }
//
//    private Hotel convertHotelDTO(HotelDTO hotelDTO){
//        return new Hotel(hotelDTO.getHotelName(),
//                hotelDTO.getLocation(),
//                hotelDTO.getContactNumber());
//    }

//    public Hotel updateHotel(Hotel hotel){
//        return hotelRepository.save(hotel);
//    }


//    public void deleteEmployee(int hotelId){
//        hotelRepository.deleteHotelByhotelId(hotelId);
//    }


    public Optional<Hotel> getHotelbyId( Integer hotelId )
    {
        return hotelRepository.findById( hotelId );
    }
}
