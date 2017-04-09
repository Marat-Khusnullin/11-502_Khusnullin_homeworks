package ru.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import ru.models.City;
import ru.models.Hotel;
import ru.service.HotelService;

import java.util.ArrayList;
import java.util.LinkedList;


@Controller
public class HotelController {
 @Autowired
    HotelService hotelService;


   /* @RequestMapping(value = "/hotels", method = RequestMethod.GET)
    public ModelAndView showUsers() {
        ModelAndView modelAndView = new ModelAndView();
        ArrayList<Hotel> hotels = (ArrayList<Hotel>) hotelService.getAllHotels();
        modelAndView.setViewName("hotel");
        modelAndView.addObject("hotelJSP", hotels);
        return modelAndView;
    }*/

}
