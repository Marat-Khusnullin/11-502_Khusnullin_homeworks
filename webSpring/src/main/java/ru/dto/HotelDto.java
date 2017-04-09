package ru.dto;


import ru.models.Hotel;

public class HotelDto {
    private int id;
    private String name;
    private int rating;
    private String dopInfo;


    public HotelDto(Hotel hotel) {
        this.id = hotel.getId();
        this.name = hotel.getName();
        this.rating = hotel.getRating();
        this.dopInfo = hotel.getDopInfo();
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

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDopInfo() {
        return dopInfo;
    }

    public void setDopInfo(String dopInfo) {
        this.dopInfo = dopInfo;
    }
}
