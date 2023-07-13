package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Vehicle;

public interface VehicleService<ID> {

    void register(Vehicle vehicle);

    void expel(Vehicle vehicle);

    void expel(ID id);

    Vehicle findVehicle(ID id);

    String whatIsVehicle(ID id);

    Integer countThisVehicle(String vehicle);

    Integer count();
}

