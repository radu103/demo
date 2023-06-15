package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.model.Car;
import com.example.demo.model.MiniCar;
import com.example.demo.model.SportCar;

@Component("carFactory")
public class CarFactoryImpl implements CarFactory {
    @Override
    public Car createCar() {
        return new Car();
    }

    @Override
    public SportCar createSportCar() {
        return new SportCar();
    }

    @Override
    public MiniCar createMiniCar() {
        return new MiniCar();
    }
}
