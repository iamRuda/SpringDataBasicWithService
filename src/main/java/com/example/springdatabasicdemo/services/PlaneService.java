package com.example.springdatabasicdemo.services;

import com.example.springdatabasicdemo.models.Plane;

public interface PlaneService<ID> {

    void register(Plane plane);

    void expel(Plane plane);

    void expel(ID id);

    Plane findPlane(ID id);

    Integer count();
}

