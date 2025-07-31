package com.xworkz.roomrent.runner;

import com.xworkz.roomrent.entity.RoomRentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RoomRentRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("rentroom");
        EntityManager eM=eMF.createEntityManager();
        EntityTransaction eT=eM.getTransaction();

        eT.begin();
        List<RoomRentEntity> room=new ArrayList<>();
        room.add(new RoomRentEntity(101,"Omkareshwar","BTM"));
        room.add(new RoomRentEntity(102,"Prajwal","Rajajinagar"));
        room.add(new RoomRentEntity(103,"Vaibhav","Bangalore"));

        for (RoomRentEntity roomRentEntity:room){
            eM.persist(roomRentEntity);
        }
        eT.commit();
        eM.close();
    }
}
