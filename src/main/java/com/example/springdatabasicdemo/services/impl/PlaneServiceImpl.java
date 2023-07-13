package com.example.springdatabasicdemo.services.impl;

import com.example.springdatabasicdemo.models.Plane;
import com.example.springdatabasicdemo.repositories.PlaneRepository;
import com.example.springdatabasicdemo.services.PlaneService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceImpl implements PlaneService<Integer> {

    @Autowired
    private PlaneRepository planeRepository;

    @Override
    public void register(Plane plane) {
        planeRepository.save(plane);
    }

    @Override
    public void expel(Plane plane) {
        planeRepository.delete(plane);
    }

    @Override
    public void expel(Integer id) {
        planeRepository.deleteById(id);
    }

    @Override
    public Plane findPlane(Integer id) {
        return planeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(id.toString()));
    }

    @Override
    public Integer count() {
        return planeRepository.findAll().size();
    }
}