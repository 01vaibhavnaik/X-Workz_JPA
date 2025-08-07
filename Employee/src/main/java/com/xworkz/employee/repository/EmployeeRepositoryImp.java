package com.xworkz.employee.repository;

import com.xworkz.employee.entity.EmployeeEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImp implements EmployeeRepository{

    @Override
    public void save(List<EmployeeEntity> list) {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try {
            entityManagerFactory= Persistence.createEntityManagerFactory("someone");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();

            entityTransaction.begin();

            for(EmployeeEntity employee:list){
                entityManager.persist(employee);
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
    public  List<EmployeeEntity>  getAll() {
        EntityManagerFactory entityManagerFactory=null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;
        List employeeEntities=null;

        try {
            entityManagerFactory= Persistence.createEntityManagerFactory("someone");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();


            entityTransaction.begin();
            Query query = entityManager.createNamedQuery("getAll");
            employeeEntities= query.getResultList();
            entityTransaction.commit();

        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }finally {
            entityManager.close();
        }
        return employeeEntities;
    }

    @Override
    public EmployeeEntity getByName(String names) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        EmployeeEntity employee = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("someone");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Query query = entityManager.createNamedQuery("getByName");
            query.setParameter("personName", names);
            employee = (EmployeeEntity) query.getSingleResult();

            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();

        }

        return employee;
    }

    @Override
    public EmployeeEntity getByPh(String no) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        EmployeeEntity employeeno = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("someone");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

           Query query=entityManager.createNamedQuery("getByPh");
           query.setParameter("PhNo",no);
           employeeno= (EmployeeEntity) query.getSingleResult();

            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();

        }

        return employeeno;
    }

    @Override
    public EmployeeEntity getByPhN(String no, String name) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction entityTransaction = null;
        EmployeeEntity employeenon = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("someone");
            entityManager = entityManagerFactory.createEntityManager();
            entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            TypedQuery<EmployeeEntity> query= entityManager.createNamedQuery("getByPhN", EmployeeEntity.class);
            query.setParameter("PhNos",no);
            query.setParameter("Name",name);
            employeenon =query.getSingleResult();


            entityTransaction.commit();

        } catch (Exception e) {
            if (entityTransaction.isActive()) {
                entityTransaction.rollback();
            }
            e.printStackTrace();
        } finally {
            entityManager.close();

        }

        return employeenon;


    }


}
