package com.xworkz.employee.service;

import com.xworkz.employee.entity.EmployeeEntity;
import com.xworkz.employee.repository.EmployeeRepository;
import com.xworkz.employee.repository.EmployeeRepositoryImp;

import java.util.List;

public class EmployeeServiceImp implements EmployeeService {
    @Override
    public void save(List<EmployeeEntity> list) {
        EmployeeRepository employeeRepository=new EmployeeRepositoryImp();
        employeeRepository.save(list);
    }

    @Override
    public  List<EmployeeEntity>  getAll() {
        EmployeeRepository employeeRepository=new EmployeeRepositoryImp();
       return new EmployeeRepositoryImp().getAll();
    }

    @Override
    public EmployeeEntity getByName(String name) {
        return new EmployeeRepositoryImp().getByName(name);
    }

    @Override
    public EmployeeEntity getByPh(String no) {
        return new EmployeeRepositoryImp().getByPh(no);
    }

    @Override
    public EmployeeEntity getByPhN(String no, String name) {
        return new EmployeeRepositoryImp().getByPhN(no,name);
    }

}
