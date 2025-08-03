package com.xworkz.pant.runner;

import com.xworkz.pant.entity.PantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PantRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;

        try{
            eMF= Persistence.createEntityManagerFactory("pant");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();
            eT.begin();

            List<PantEntity> pantEntities = new ArrayList<>();
            pantEntities.add(new PantEntity(1, "Levis", "Blue"));
            pantEntities.add(new PantEntity(2, "Wrangler", "Black"));
            pantEntities.add(new PantEntity(3, "Lee", "Grey"));
            pantEntities.add(new PantEntity(4, "Puma", "Red"));
            pantEntities.add(new PantEntity(5, "Nike", "White"));
            pantEntities.add(new PantEntity(6, "Adidas", "Green"));
            pantEntities.add(new PantEntity(7, "Reebok", "Yellow"));
            pantEntities.add(new PantEntity(8, "H&M", "Pink"));
            pantEntities.add(new PantEntity(9, "Zara", "Brown"));
            pantEntities.add(new PantEntity(10, "Gap", "Purple"));

            for(PantEntity pantEntity : pantEntities) {
                eM.persist(pantEntity);
            }
            eT.commit();

        }catch (Exception e) {
            if (eT.isActive()) {
                eT.rollback();
            }
        }
        finally{
               eM.close();
            }

    }
}
