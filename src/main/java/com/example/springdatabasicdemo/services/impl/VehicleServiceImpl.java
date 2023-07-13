package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.models.Vehicle;
import com.example.springdatabasicdemo.repositories.VehicleRepository;
import com.example.springdatabasicdemo.services.VehicleService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService<Integer> {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void register(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }

    @Override
    public void expel(Vehicle vehicle) {
        vehicleRepository.delete(vehicle);
    }

    @Override
    public void expel(Integer id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public Vehicle findVehicle(Integer id) {
        return vehicleRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public String whatIsVehicle(Integer id) {
        return vehicleRepository.findById(id).get().getType();
    }

    @Override
    public Integer countThisVehicle(String type) {
        return vehicleRepository.findAllByType(type).size();
    }

    @Override
    public Integer count() {
        return vehicleRepository.findAll().size();
    }
}