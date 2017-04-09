package ru.dao;

import ru.models.Hotel;

import java.util.List;


public interface HotelDao {
    void addHotel(Hotel hotel);
    List<Hotel> getHotelsByCityId(int id);
    List<Hotel> getAllHotels();
    void deleteHotel(Hotel hotel);
    void update(Hotel hotel);

}
