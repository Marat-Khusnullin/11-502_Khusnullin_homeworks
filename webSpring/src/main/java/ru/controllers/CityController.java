package ru.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.models.City;
import ru.service.CityService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;

@org.springframework.stereotype.Controller
public class CityController   {
    @Autowired
    CityService cityService;


    /*@RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ModelAndView getUsers()  {
        ModelAndView modelAndView = new ModelAndView();
        LinkedList<City> cities = (LinkedList<City>) cityService.getCities();
        modelAndView.setViewName("city");
        modelAndView.addObject("citiesJSP", cities);
        return modelAndView;
    }*/



    @RequestMapping(value = "/newCityMvc", method = RequestMethod.GET)
    public ModelAndView setUser(Model model)  {
        model.addAttribute(new City());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("newCityMvc");

        return modelAndView;
    }

    @RequestMapping(value = "/newCityMvc", method = RequestMethod.POST)
    public ModelAndView setUser(@ModelAttribute("city")City city)  {
        ModelAndView modelAndView = new ModelAndView();
        cityService.addCity(city);
        LinkedList<City> cities = (LinkedList<City>) cityService.getCities();
        modelAndView.setViewName("city");
        modelAndView.addObject("citiesJSP", cities);
        return modelAndView;
    }
}
