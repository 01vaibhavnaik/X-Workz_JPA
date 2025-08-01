package com.xworkz.roomrent.runner;

import com.xworkz.roomrent.entity.RoomRentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class RoomRentUpdateRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF = null;
        EntityManager eM = null;
        EntityTransaction eT = null;
        try {
            eMF = Persistence.createEntityManagerFactory("rentroom");
            eM = eMF.createEntityManager();
            eT = eM.getTransaction();
            eT.begin();

            RoomRentEntity roomRentEntity= eM.find(RoomRentEntity.class,1);
          roomRentEntity.setRoomName("Toilet");
            eM.merge(roomRentEntity);
//            eM.remove(roomRentEntity);
            eT.commit();

        } catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }

        } finally {
            eM.close();
        }

    }
}

