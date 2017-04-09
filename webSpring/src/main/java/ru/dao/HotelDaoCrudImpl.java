package ru.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.models.Hotel;

import java.util.LinkedList;


public interface HotelDaoCrudImpl extends CrudRepository<Hotel, Integer> {
    void delete(int id);
    Hotel save(Hotel hotel);
    LinkedList<Hotel> findAll();
    Hotel findOne(int id);

}
