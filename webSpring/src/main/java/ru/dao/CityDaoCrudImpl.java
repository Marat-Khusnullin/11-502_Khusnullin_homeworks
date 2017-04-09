package ru.dao;

import org.springframework.data.repository.CrudRepository;
import ru.models.City;
import ru.models.Hotel;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.LinkedList;

/**
 * Created by Марат on 09.04.2017.
 */
public interface CityDaoCrudImpl extends CrudRepository<City, Integer> {
    void delete(int id);
    City save(City city);
    LinkedList<City> findAll();
    City findOne(int id);
}
