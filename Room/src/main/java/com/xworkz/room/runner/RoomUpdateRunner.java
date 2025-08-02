package com.xworkz.room.runner;

import com.xworkz.room.entity.RoomEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RoomUpdateRunner {
    public static void main(String[] args) {

        EntityManagerFactory eMF = Persistence.createEntityManagerFactory("room");
    EntityManager eM= eMF.createEntityManager();
    EntityTransaction eT=eM.getTransaction();

    eT.begin();
    RoomEntity room= eM.find(RoomEntity.class,0);
    eM.remove(room);
    eT.commit();



    }
}
