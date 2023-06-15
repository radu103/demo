package com.example.demo.factory;

import org.springframework.stereotype.Component;

import com.example.demo.model.Vehicle;

@Component("vehicleFactory")
public class VehicleFactoryImpl implements VehicleFactory {
    @Override
    public Vehicle createVehicle(String name) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName(name);
        return vehicle;
    }
}
