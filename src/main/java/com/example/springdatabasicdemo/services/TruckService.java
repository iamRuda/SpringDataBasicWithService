package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Truck;

public interface TruckService<ID> {

    void register(Truck truck);

    void expel(Truck truck);

    void expel(ID id);

    Truck findTruck(ID id);

    Integer count();
}

