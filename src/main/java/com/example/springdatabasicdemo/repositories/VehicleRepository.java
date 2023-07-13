package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Bike;
import com.example.springdatabasicdemo.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
    List<Vehicle> findAllByType(String type);
}
