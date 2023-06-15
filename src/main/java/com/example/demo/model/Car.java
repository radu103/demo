package com.example.demo.model;

import lombok.Data;

@Data
public class Car extends Vehicle {
    private Integer numberOfSeats;
    private String color;
    private Integer diesel;

    public Car paintCar(String color) {
        this.setColor(color);
        return this;
    }

    public Car fillCar(Integer diesel) {
        this.setDiesel(diesel);
        return this;
    }

    public Car putSeats(Integer seats) {
        this.setNumberOfSeats(seats);
        return this;
    }
}
