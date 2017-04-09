package ru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import ru.dao.CityDao;
import ru.dao.CityDaoCrudImpl;
import ru.models.City;

import java.util.LinkedList;
import java.util.List;


@Component
public class CityServiceImpl implements CityService {

    @Autowired
    CityDaoCrudImpl cityDaoCrud;


    public void delete(int id) {
        cityDaoCrud.delete(id);
    }

    public City save(City city) {
        return cityDaoCrud.save(city);
    }

    public LinkedList<City> findAll() {
        return cityDaoCrud.findAll();
    }

    public City findOne(int id) {
        return cityDaoCrud.findOne(id);
    }
}
