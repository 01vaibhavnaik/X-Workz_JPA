package com.xworkz.trip.service;

import com.xworkz.trip.entity.TripEntity;
import com.xworkz.trip.repository.TripRepository;
import com.xworkz.trip.repository.TripRepositoryImp;

import java.util.List;

public class TripServiceImp implements TripService{
    @Override
    public void save(List<TripEntity> tripEntities) {
        TripRepository tripRepository=new TripRepositoryImp();
        tripRepository.save(tripEntities);

    }

    @Override
    public List<TripEntity>  getAll() {
        return new TripRepositoryImp().getAll();
    }

    @Override
    public TripEntity getByName(String name) {
        return new TripRepositoryImp().getByName(name);
    }
}
