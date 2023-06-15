package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.factory.CarFactory;
import com.example.demo.model.Car;
import com.example.demo.strategy.UseStrategy;
import com.example.demo.strategy.UseStrategyBasicImpl;
import com.example.demo.strategy.UseStrategyComplexImpl;

@Service("carService")
public class CarServiceImpl {
    
    @Autowired
    private CarFactory carFactory;

    private UseStrategy strategy;

    public List<Car> getCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(carFactory.createSportCar());
        cars.add(carFactory.createMiniCar());
        cars.add(carFactory.createCar("Ferrari"));

        Car car = carFactory.createCar("Ferrari");
        car.paintCar("red").fillCar(100).putSeats(2);
        car.putSeats(4).fillCar(50).paintCar("blue");
        cars.add(car);

        return cars;
    }

    public void setStrategy(UseStrategy strategy) {
        this.strategy = strategy;
    }

    public String use(Car car){
        if(car.getDiesel() > 0)
        {
            this.strategy = new UseStrategyBasicImpl();
        }
        else
        {
            this.strategy = new UseStrategyComplexImpl();
        }
        return this.strategy.use();
    }   
}
