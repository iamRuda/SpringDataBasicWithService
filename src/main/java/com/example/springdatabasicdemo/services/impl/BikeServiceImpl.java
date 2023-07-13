package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.models.Bike;
import com.example.springdatabasicdemo.repositories.BikeRepository;
import com.example.springdatabasicdemo.services.BikeService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeServiceImpl implements BikeService<Integer> {

    @Autowired
    private BikeRepository bikeRepository;

    @Override
    public void register(Bike bike) {
        bikeRepository.save(bike);
    }

    @Override
    public void expel(Bike bike) {
        bikeRepository.delete(bike);
    }

    @Override
    public void expel(Integer id) {
        bikeRepository.deleteById(id);
    }

    @Override
    public Bike findBike(Integer id) {
        return bikeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public Integer count() {
        return bikeRepository.findAll().size();
    }
}