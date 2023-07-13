package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Bike;

public interface BikeService<ID> {

    void register(Bike bike);

    void expel(Bike bike);

    void expel(ID id);

    Bike findBike(ID id);

    Integer count();
}

