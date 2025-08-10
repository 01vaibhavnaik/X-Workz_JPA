package com.xworkz.trip.service;

import com.xworkz.trip.entity.TripEntity;

import java.util.List;

public interface TripService {
    void save(List<TripEntity> tripEntities);
   List <TripEntity> getAll();
   TripEntity getByName(String name);
    TripEntity getByEmail(String name);



}
