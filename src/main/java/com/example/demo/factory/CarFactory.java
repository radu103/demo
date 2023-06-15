package com.example.demo.factory;

import com.example.demo.model.Car;
import com.example.demo.model.MiniCar;
import com.example.demo.model.SportCar;

public interface CarFactory extends VehicleFactory {
    Car createCar(String name);
    SportCar createSportCar();
    MiniCar createMiniCar();
}
