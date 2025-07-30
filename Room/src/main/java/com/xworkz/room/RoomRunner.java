package com.xworkz.room;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RoomRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF =Persistence.createEntityManagerFactory("room");
        if (eMF != null){
            System.out.println("This is working");
        }
    }
}
