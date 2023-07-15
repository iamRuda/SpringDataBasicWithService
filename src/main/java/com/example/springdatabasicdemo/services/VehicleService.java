package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Vehicle;

import java.util.List;

public interface VehicleService<ID> {

    void register(Vehicle vehicle);

    void expel(Vehicle vehicle);

    void expel(ID id);

    Vehicle findVehicle(ID id);

    String whatIsVehicle(ID id);

    List<Integer> getIdsThisType(String type);

    Integer countThisVehicle(String vehicle);

    Integer count();
}

