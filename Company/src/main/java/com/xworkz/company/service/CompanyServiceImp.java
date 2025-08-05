package com.xworkz.company.service;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.repository.CompanyRepository;
import com.xworkz.company.repository.CompanyRepositoryImp;

public class CompanyServiceImp implements CompanyService {
    @Override
    public void valid(CompanyEntity companyEntity) {
        CompanyRepository companyRepository=new CompanyRepositoryImp();
        companyRepository.save(companyEntity);
    }

    @Override
    public void updateCompanyNameById(int id, String name) {
        CompanyRepository companyRepository=new CompanyRepositoryImp();
        companyRepository.updateCompanyNameById(id,name);
    }

    @Override
    public void deleteById(int id) {
        CompanyRepository companyRepository=new CompanyRepositoryImp();
        companyRepository.deleteById(id);
    }


}
