package com.example.demo.factory;

import com.example.demo.model.Car;
import com.example.demo.model.Truck;

public interface VehicleFactory {
    Car createCar();
    Truck createTruck();
}
