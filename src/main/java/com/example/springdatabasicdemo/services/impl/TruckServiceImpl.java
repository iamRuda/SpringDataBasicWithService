package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.models.Truck;
import com.example.springdatabasicdemo.repositories.TruckRepository;
import com.example.springdatabasicdemo.services.TruckService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TruckServiceImpl implements TruckService<Integer> {

    @Autowired
    private TruckRepository truckRepository;

    @Override
    public void register(Truck truck) {
        truckRepository.save(truck);
    }

    @Override
    public void expel(Truck truck) {
        truckRepository.delete(truck);
    }

    @Override
    public void expel(Integer id) {
        truckRepository.deleteById(id);
    }

    @Override
    public Truck findTruck(Integer id) {
        return truckRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public Integer count() {
        return truckRepository.findAll().size();
    }
}