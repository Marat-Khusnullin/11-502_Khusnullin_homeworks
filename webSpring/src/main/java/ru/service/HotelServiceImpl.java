package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.dao.HotelDao;
import ru.dao.HotelDaoCrudImpl;
import ru.models.City;
import ru.models.Hotel;

import java.util.LinkedList;
import java.util.List;

@Component
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelDaoCrudImpl hotelDaoCrud;


    public Hotel save(Hotel hotel) {
       return hotelDaoCrud.save(hotel);
    }

    public Hotel findOne(int id) {
        return hotelDaoCrud.findOne(id);
    }

    public void delete(int id) {
         hotelDaoCrud.delete(id);
    }

    public LinkedList<Hotel> findAll() {
        return hotelDaoCrud.findAll();
    }
}
