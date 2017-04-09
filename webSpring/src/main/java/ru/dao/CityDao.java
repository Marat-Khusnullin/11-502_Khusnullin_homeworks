package ru.dao;

import ru.models.City;

import java.util.List;


public interface CityDao {
     List<City> getCities();
     int addCity(City city);
     void deleteCity(int id);
     City getCityById(int id);
}
