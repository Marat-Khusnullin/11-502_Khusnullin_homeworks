package ru.models;


import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "city")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String country;
    @Column
    private String sights;
    @OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
    private List<Hotel> hotels;





    public City() {

    }

    public City(int id, String name, String country, String sights, List<Hotel> hotels) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.sights = sights;
        this.hotels = hotels;
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

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }


    public  boolean compareCities( City cityTwo) {
        if(getId() == cityTwo.getId()) {
            if(getName().equals(cityTwo.getName())) {
                if (getCountry().equals(cityTwo.getCountry())) {
                    if(getSights().equals(cityTwo.getSights())) {
                        for (int i = 0; i <getHotels().size() ; i++) {
                            if(getHotels().get(i).getId()!=cityTwo.getHotels().get(i).getId() || !getHotels().get(i).getName().equals(cityTwo.getHotels().get(i).getName())
                                    || getHotels().get(i).getRating()!=cityTwo.getHotels().get(i).getRating()
                                    || !getHotels().get(i).getDopInfo().equals(cityTwo.getHotels().get(i).getDopInfo())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
