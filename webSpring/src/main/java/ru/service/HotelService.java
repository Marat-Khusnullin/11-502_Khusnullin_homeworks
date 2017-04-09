package ru.service;

import ru.models.City;
import ru.models.Hotel;

import java.util.LinkedList;
import java.util.List;


public interface HotelService {
    Hotel save(Hotel hotel);
    Hotel findOne(int id);
    void delete(int id);
    LinkedList<Hotel> findAll();

}
