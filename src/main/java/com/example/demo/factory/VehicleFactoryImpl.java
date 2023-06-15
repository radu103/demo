package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.model.Car;
import com.example.demo.model.Truck;

@Component("vehicleFactory")
public class VehicleFactoryImpl implements VehicleFactory {
    
    @Override
    public Car createCar() {
        return new Car();
    }

    @Override
    public Truck createTruck() {
        return new Truck();
    }
}
