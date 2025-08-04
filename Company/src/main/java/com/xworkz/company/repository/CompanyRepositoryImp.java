package com.xworkz.company.repository;

import com.xworkz.company.entity.CompanyEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CompanyRepositoryImp implements CompanyRepository {

    @Override
    public void save(CompanyEntity companyEntity) {

        EntityManagerFactory entityManagerFactory= null;
        EntityManager entityManager=null;
        EntityTransaction entityTransaction=null;

        try{
            entityManagerFactory= Persistence.createEntityManagerFactory("company");
            entityManager=entityManagerFactory.createEntityManager();
            entityTransaction=entityManager.getTransaction();
            entityTransaction.begin();

            List<CompanyEntity> comp=new ArrayList<>();
            comp.add(new CompanyEntity(1,"Apple",200));
            comp.add(new CompanyEntity(2,"Microsoft",500));
            comp.add(new CompanyEntity(3,"Nike",800));
            comp.add(new CompanyEntity(4,"NVDIA",100));

            for (CompanyEntity company:comp){
                entityManager.persist(company);

            }
            entityTransaction.commit();


        }catch (Exception e){
            if(entityTransaction.isActive()){
                entityTransaction.rollback();
            }
        }
        finally {
            entityManager.close();
        }


    }
}
