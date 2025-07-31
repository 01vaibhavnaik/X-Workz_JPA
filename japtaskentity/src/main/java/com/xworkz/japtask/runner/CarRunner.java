package com.xworkz.japtask.runner;

import com.xworkz.japtask.entity.CarEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("car");
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT= eM.getTransaction();

        eT.begin();
        List<CarEntity> car= new ArrayList<>();
        car.add(new CarEntity(1,"BMW","273782"));
        car.add(new CarEntity(2,"Ford","868733"));
        car.add(new CarEntity(3,"Defender","973763"));

        for (CarEntity carEntity:car){
            eM.persist(carEntity);

        }

//        CarEntity carEntity=eM.find(CarEntity.class,2);
        eT.commit();
        eM.close();
    }

}
