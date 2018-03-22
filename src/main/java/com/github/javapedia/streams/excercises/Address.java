package com.github.javapedia.streams.excercises;

import java.util.UUID;

public class Address {

    private String uuid;
    private String street;
    private String city;
    private String country;

    public Address(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
        uuid = UUID.randomUUID().toString();
    }

    public String print() {
        return street + " " + city + " " + country;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }
}
