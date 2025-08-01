package com.xworkz.room.runner;

import com.xworkz.room.entity.RoomEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RoomRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF =Persistence.createEntityManagerFactory("room");
        EntityManager eM= eMF.createEntityManager();
        EntityTransaction eT=eM.getTransaction();

        eT.begin();
        List<RoomEntity> rooms=new ArrayList<RoomEntity>();
        rooms.add(new RoomEntity(201,"Hall",360));
        rooms.add(new RoomEntity(203,"BedRoom",300));
        rooms.add(new RoomEntity(204,"Gallary",200));

        for (RoomEntity room:rooms){
            eM.persist(room);
        }
        eT.commit();
        eM.close();

    }
}
