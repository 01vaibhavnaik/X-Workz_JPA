package com.xworkz.company.repository;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyRepository {

    public void save(CompanyEntity companyEntity);

    public void updateCompanyNameById(int id,String name);

    public void deleteById(int id);
}
