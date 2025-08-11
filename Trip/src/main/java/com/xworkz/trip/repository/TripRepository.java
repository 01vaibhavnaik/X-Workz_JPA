package com.xworkz.trip.repository;

import com.xworkz.trip.entity.TripEntity;

import java.util.List;

public interface TripRepository {
    void save(List<TripEntity> tripEntities);
    List<TripEntity> getAll();
    TripEntity getByName(String name);
    TripEntity getByEmail(String name);
    TripEntity getByLDEmail(String email);
}
