package ru.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.dto.CityDto;
import ru.models.City;
import ru.service.CityService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;


@Controller
public class RestController {

    @Autowired
    CityService cityService;


    @RequestMapping(value = "cities", method = RequestMethod.POST)
    @ResponseBody
    public String getCities() {
        LinkedList<City> cities = (LinkedList<City>) cityService.getCities();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "error";
        LinkedList<CityDto> cityDtos = new LinkedList<CityDto>();
        try {
            for (int i = 0; i <cities.size(); i++) {
                CityDto cityDto = new CityDto(cities.get(i));
                cityDtos.add(cityDto);
            }
            json = objectMapper.writeValueAsString(cityDtos);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }return  json;
    }

    @RequestMapping(value = "cities/{city-id}", method = RequestMethod.GET)
    @ResponseBody
    public String getCity(@PathVariable("city-id") int cityId) {
        City city = cityService.getCityById(cityId);
        ObjectMapper objectMapper = new ObjectMapper();
        CityDto cityDto = new CityDto(city);
        String json = "error";
        try {
            city.setHotels(null);
            json = objectMapper.writeValueAsString(cityDto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }return  json;
    }


    @RequestMapping(value = "cities/add", method = RequestMethod.POST)
    public void addCity(@RequestBody() String cityValue ) {
        ObjectMapper objectMapper  = new ObjectMapper();
        City city = null;
        try {
            city = objectMapper.readValue(cityValue, City.class);
        } catch (IOException e) {
            throw new IllegalArgumentException();
        }
        cityService.addCity(city);
    }






}
