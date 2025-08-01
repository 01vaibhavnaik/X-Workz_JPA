package com.xworkz.kingdom.runner;

import com.xworkz.kingdom.entity.KingdomEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class KingdomRunner {
    public static void main(String[] args) {
        EntityManagerFactory eMF=null;
        EntityManager eM=null;
        EntityTransaction eT=null;

        try{
            eMF= Persistence.createEntityManagerFactory("kingdom");
            eM=eMF.createEntityManager();
            eT=eM.getTransaction();

            eT.begin();
            KingdomEntity kingdomEntity= eM.find(KingdomEntity.class,1);
            kingdomEntity.setKingname("vaibhav");
            eM.merge(kingdomEntity);
            eT.commit();


        }catch (Exception e){
            if(eT.isActive()){
                eT.rollback();
            }
        }finally{
            eM.close();

        }
    }
}
