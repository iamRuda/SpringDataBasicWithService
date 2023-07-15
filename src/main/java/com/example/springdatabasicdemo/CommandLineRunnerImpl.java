package com.example.springdatabasicdemo;

import com.example.springdatabasicdemo.models.*;
import com.example.springdatabasicdemo.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private VehicleService vehicleService;
    @Autowired
    private BikeService bikeService;
    @Autowired
    private CarService carService;
    @Autowired
    private PlaneService planeService;
    @Autowired
    private TruckService truckService;

    @Override
    public void run(String... args) throws Exception {
        saveData();
        String typeVechical = vehicleService.whatIsVehicle(2);
        int countCarThroughVehicleService = vehicleService.countThisVehicle(typeVechical);
        int countCarThroughCarService = bikeService.count();
        System.out.println(typeVechical);
        System.out.println(countCarThroughVehicleService);
        System.out.println(countCarThroughCarService);
        System.out.println(vehicleService.getIdsThisType("CAR"));
    }

    private void saveData() throws IOException {
        //Добавление в БД записей
        Bike bike = new Bike("R1", BigDecimal.valueOf(300.49), "Oil");
        Car car = new Car("GT300", BigDecimal.valueOf(5300.01), "Petrol-100", 4);
        Plane plane = new Plane("AirSoft", BigDecimal.valueOf(50000.34), "Kerosin", "S9", 12);
        Truck truck = new Truck("Kamaz", BigDecimal.valueOf(3145.12), "Disel", 4.25);
        Bike another_bike = new Bike("H1", BigDecimal.valueOf(120.49), "Oil");
        // Car another_car = new Car("GT500", BigDecimal.valueOf(8300.01), "Petrol-100", 6);
        Plane another_plane = new Plane("AirLoft", BigDecimal.valueOf(60000.34), "Petrol-88", "S9", 2);
        Truck another_truck = new Truck("Qumaz", BigDecimal.valueOf(4145.12), "Electro", 2.25);

        bikeService.register(bike);
        bikeService.register(another_bike);
        carService.register(car);
        // carService.register(another_car);
        planeService.register(plane);
        planeService.register(another_plane);
        truckService.register(truck);
        truckService.register(another_truck);
    }
}
