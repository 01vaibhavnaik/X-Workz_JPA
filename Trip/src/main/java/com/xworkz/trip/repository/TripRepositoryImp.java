package com.xworkz.trip.repository;

import com.xworkz.trip.entity.TripEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class TripRepositoryImp implements TripRepository{
    EntityManagerFactory entityManagerFactory=null;
    @Override
    public void save(List<TripEntity> tripEntities) {
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        TripEntity entity=null;


        try {
            entityManagerFactory= Persistence.createEntityManagerFactory("trip");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

            for (TripEntity tripEntity:tripEntities){
                entityManager.persist(tripEntity);
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

    @Override
    public List <TripEntity> getAll() {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        List tripEntity = null;


        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("trip");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getAll");
            tripEntity =query.getResultList();
            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

        return tripEntity ;

    }
}
