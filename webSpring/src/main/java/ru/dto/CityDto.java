package ru.dto;


import ru.models.City;

public class CityDto {
    private String name;
    private String country;
    private String sights;
    private int id;

    public CityDto(City city) {
        this.name = city.getName();
        this.country = city.getCountry();
        this.sights = city.getSights();
        this.id = city.getId();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSights() {
        return sights;
    }

    public void setSights(String sights) {
        this.sights = sights;
    }
}
