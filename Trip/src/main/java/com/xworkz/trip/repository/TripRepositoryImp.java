package com.xworkz.trip.repository;

import com.xworkz.trip.entity.TripEntity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

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

    @Override
    public TripEntity getByLDEmail(String email) {
        EntityManager em=null;
        EntityTransaction et=null;
        TripEntity trip=new TripEntity();
        try {

            entityManagerFactory=Persistence.createEntityManagerFactory("trip");
            em=entityManagerFactory.createEntityManager();
            et=em.getTransaction();
            et.begin();

            Query query=em.createNamedQuery("getTripDay");
            query.setParameter("Email",email);
           Object[] objects =(Object[]) query.getSingleResult();
           String name=(String) objects[0];
           int day=(int) objects[1];

           trip.setTriplocation(name);
           trip.setDays(day);

            System.out.println("Location"+name+"Days"+day);

            et.commit();


        } catch (Exception e) {
            if (et.isActive()) {
                et.rollback();
            }
            e.printStackTrace();
        } finally {
            em.close();
        }

        return trip;
    }
}
