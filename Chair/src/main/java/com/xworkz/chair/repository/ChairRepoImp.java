package com.xworkz.chair.repository;

import com.xworkz.chair.entity.ChairEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class ChairRepoImp implements ChairRepo{
    @Override
    public void save(ChairEntity chair) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
            entityManagerFactory= Persistence.createEntityManagerFactory("chair");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            entityManager.persist(chair);
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
    }

    @Override
    public void saves(List<ChairEntity> list) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
            entityManagerFactory= Persistence.createEntityManagerFactory("chair");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            for(ChairEntity chair:list) {
                entityManager.persist(chair);
            }
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
    }

}
