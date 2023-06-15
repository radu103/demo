package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.model.Car;
import com.example.demo.model.MiniCar;
import com.example.demo.model.SportCar;

@Component("carFactory")
public class CarFactoryImpl extends VehicleFactoryImpl implements CarFactory {
    
    @Override
    public Car createCar(String name) {
        Car car = (Car)this.createVehicle(name);
        car.setNumberOfSeats(4);
        return car;
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
