package ru.service;


import ru.models.City;

import java.util.LinkedList;
import java.util.List;

public interface CityService {
    void delete(int id);
    City save(City city);
    LinkedList<City> findAll();
    City findOne(int id);
}
