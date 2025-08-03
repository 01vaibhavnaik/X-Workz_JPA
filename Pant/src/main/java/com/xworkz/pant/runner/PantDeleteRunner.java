package com.xworkz.pant.runner;

import com.xworkz.pant.entity.PantEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class PantDeleteRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;

        try{
            eMF= Persistence.createEntityManagerFactory("pant");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();
            eT.begin();

            PantEntity pantEntity = eM.find(PantEntity.class, 5);
            PantEntity pantEntity1 = eM.find(PantEntity.class, 8);
            eM.remove(pantEntity);
            eM.remove(pantEntity1);
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
