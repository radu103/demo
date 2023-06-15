package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.factory.CarFactory;
import com.example.demo.model.Car;

@Service("carService")
public class CarServiceImpl {
    
    @Autowired
    private CarFactory carFactory;

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(carFactory.createSportCar());
        cars.add(carFactory.createMiniCar());
        cars.add(carFactory.createCar());
        return cars;
    }
}
