package com.xworkz.employee.repository;

import com.xworkz.employee.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeRepository {
    public void save(List<EmployeeEntity> list);

    public  List<EmployeeEntity>  getAll();
    public EmployeeEntity getByName(String name);
    public EmployeeEntity getByPh(String no);
    EmployeeEntity getByPhN(String no,String name);


}
