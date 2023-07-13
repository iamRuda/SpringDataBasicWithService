package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Car;

public interface CarService<ID> {

    void register(Car car);

    void expel(Car car);

    void expel(ID id);

    Car findCar(ID id);

    Integer count();
}

