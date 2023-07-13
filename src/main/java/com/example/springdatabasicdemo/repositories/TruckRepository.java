package com.example.springdatabasicdemo.repositories;

import com.example.springdatabasicdemo.models.Truck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Integer> {
}
