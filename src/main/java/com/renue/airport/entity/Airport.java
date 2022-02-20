package com.renue.airport.entity;

import java.util.Objects;

public class Airport {
    private String id;
    private String title;
    private String city;
    private String country;
    private String abbreviation_city;
    private String abbreviation_country;
    private String coordinates_1;
    private String coordinates_2;
    private String type;
    private String zone;
    private String name;
    private String group;

    public Airport(String id, String title, String city, String country,
                   String abbreviation_city, String abbreviation_country, String coordinates_1,
                   String coordinates_2, String type, String zone, String name, String group) {
        this.id = id;
        this.title = title;
        this.city = city;
        this.country = country;
        this.abbreviation_city = abbreviation_city;
        this.abbreviation_country = abbreviation_country;
        this.coordinates_1 = coordinates_1;
        this.coordinates_2 = coordinates_2;
        this.type = type;
        this.zone = zone;
        this.name = name;
        this.group = group;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAbbreviation_city() {
        return abbreviation_city;
    }

    public void setAbbreviation_city(String abbreviation_city) {
        this.abbreviation_city = abbreviation_city;
    }

    public String getAbbreviation_country() {
        return abbreviation_country;
    }

    public void setAbbreviation_country(String abbreviation_country) {
        this.abbreviation_country = abbreviation_country;
    }

    public String getCoordinates_1() {
        return coordinates_1;
    }

    public void setCoordinates_1(String coordinates_1) {
        this.coordinates_1 = coordinates_1;
    }

    public String getCoordinates_2() {
        return coordinates_2;
    }

    public void setCoordinates_2(String coordinates_2) {
        this.coordinates_2 = coordinates_2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airport airport = (Airport) o;
        return Objects.equals(id, airport.id) && Objects.equals(title, airport.title) && Objects.equals(city, airport.city) && Objects.equals(country, airport.country) && Objects.equals(abbreviation_city, airport.abbreviation_city) && Objects.equals(abbreviation_country, airport.abbreviation_country) && Objects.equals(coordinates_1, airport.coordinates_1) && Objects.equals(coordinates_2, airport.coordinates_2) && Objects.equals(type, airport.type) && Objects.equals(zone, airport.zone) && Objects.equals(name, airport.name) && Objects.equals(group, airport.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, city, country, abbreviation_city, abbreviation_country, coordinates_1, coordinates_2, type, zone, name, group);
    }

    @Override
    public String toString() {
        return "Airport{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", abbreviation_city='" + abbreviation_city + '\'' +
                ", abbreviation_country='" + abbreviation_country + '\'' +
                ", coordinates_1='" + coordinates_1 + '\'' +
                ", coordinates_2='" + coordinates_2 + '\'' +
                ", type='" + type + '\'' +
                ", zone='" + zone + '\'' +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
