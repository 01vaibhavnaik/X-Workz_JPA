package com.xworkz.employee.service;

import com.xworkz.employee.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    public void save(List<EmployeeEntity> lists);
    public List<EmployeeEntity>  getAll();
    public EmployeeEntity getByName(String name);
    public EmployeeEntity getByPh(String no);
    EmployeeEntity getByPhN(String no,String name);


}
