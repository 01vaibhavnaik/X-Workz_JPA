package com.xworkz.company.runner;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.service.CompanyService;
import com.xworkz.company.service.CompanyServiceImp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class CompanyRunner {
    public static void main(String[] args) {

        CompanyEntity company=new CompanyEntity();
        CompanyService companyService=new CompanyServiceImp();
        companyService.valid(company);

    }
}
