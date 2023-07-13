package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.models.Car;
import com.example.springdatabasicdemo.repositories.CarRepository;
import com.example.springdatabasicdemo.services.CarService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService<Integer> {

    @Autowired
    private CarRepository carRepository;

    @Override
    public void register(Car car) {
        carRepository.save(car);
    }

    @Override
    public void expel(Car car) {
        carRepository.delete(car);
    }

    @Override
    public void expel(Integer id) {
        carRepository.deleteById(id);
    }

    @Override
    public Car findCar(Integer id) {
        return carRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public Integer count() {
        return carRepository.findAll().size();
    }
}