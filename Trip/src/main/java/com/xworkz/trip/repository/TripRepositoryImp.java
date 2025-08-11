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
        List<TripEntity> list= null;


        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("trip");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getAll");
            list =query.getResultList();list.forEach(s-> System.out.println(s));


            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

        return list ;

    }

    @Override
    public TripEntity getByName(String name) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        TripEntity trip=null;



        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("trip");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            TypedQuery query = entityManager.createNamedQuery("getByName", TripEntity.class);
            query.setParameter("place", name);
            trip=(TripEntity) query.getSingleResult();
            entityTransaction.commit();
            System.out.println("Name"+trip);

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

        return trip;

    }

    @Override
    public TripEntity getByEmail(String name) {
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        TripEntity trip=null;



        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("trip");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();

            entityTransaction.begin();
            TypedQuery query = entityManager.createNamedQuery("getByEmail", TripEntity.class);
            query.setParameter("email", name);
            trip=(TripEntity) query.getSingleResult();
            System.out.println("Name"+trip);
            entityTransaction.commit();


        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
        } finally {
            entityManager.close();
        }

        return trip;
    }
}
