package com.example.demo.model;

import lombok.Data;

@Data
public class Vehicle {

    private String name;

    public Vehicle clone() {
        Vehicle clone = new Vehicle();
        clone.setName(this.getName());
        return clone;
    }
}