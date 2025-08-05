package com.xworkz.company.service;

import com.xworkz.company.entity.CompanyEntity;

public interface CompanyService {

    public void valid(CompanyEntity companyEntity);
    public void updateCompanyNameById(int id,String name);
    public void deleteById(int id);


}
