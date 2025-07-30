package com.xworkz.roomrent;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RoomRentRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF= Persistence.createEntityManagerFactory("rentroom");
        if(eMF!=null){
            System.out.println("this is working...");
        }
    }
}
