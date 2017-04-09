package ru.rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.dto.HotelDto;
import ru.models.Hotel;
import ru.service.HotelService;

import java.util.LinkedList;

@Controller
public class HotelRestController {


    @Autowired
    HotelService hotelService;

    @RequestMapping(value = "hotels", method = RequestMethod.GET)
    @ResponseBody
    public String getCities() {
        LinkedList<Hotel> hotels = (LinkedList<Hotel>) hotelService.findAll();
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "error";
        LinkedList<HotelDto> hotelDtos = new LinkedList<HotelDto>();
        try {
            for (int i = 0; i < hotels.size(); i++) {
                HotelDto hotelDto = new HotelDto(hotels.get(i));
                hotelDtos.add(hotelDto);
            }
            json = objectMapper.writeValueAsString(hotelDtos);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }


    @RequestMapping(value = "hotels/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String getCities(@PathVariable("id") int hotelId) {

        ObjectMapper objectMapper = new ObjectMapper();
        String json = "error";
        try {
            HotelDto hotelDto = new HotelDto(hotelService.findOne(hotelId));
            json = objectMapper.writeValueAsString(hotelDto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }


    @RequestMapping(value = "hotels/{id}", method = RequestMethod.POST)
    @ResponseBody
    public void deleteCity(@PathVariable("id") int hotelId) {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = "error";
        hotelService.delete(hotelId);
    }
}
