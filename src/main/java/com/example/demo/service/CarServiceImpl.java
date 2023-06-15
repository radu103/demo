package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.factory.VehicleFactory;
import com.example.demo.model.Car;

@Service("carService")
public class CarServiceImpl {
    
    @Autowired
    private VehicleFactory vehicleFactory;

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(vehicleFactory.createCar());
        cars.add(vehicleFactory.createCar());
        cars.add(vehicleFactory.createCar());
        return cars;
    }
}
