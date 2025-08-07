package com.xworkz.employee.runner;

import com.xworkz.employee.entity.EmployeeEntity;
import com.xworkz.employee.service.EmployeeService;
import com.xworkz.employee.service.EmployeeServiceImp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeEntityRunner {
    public static void main(String[] args) {


        List<EmployeeEntity> employeeEntities = new ArrayList<>();

        employeeEntities.add(new EmployeeEntity("Vaibhav", "Bangalore", 23, "vaibhav@gmail", "7639968962"));
        employeeEntities.add(new EmployeeEntity("Chaitanya", "Bangalore", 23, "chaitanya@gmail", "8789902893"));
        employeeEntities.add(new EmployeeEntity("Sankalp", "Goa", 16, "sankalp@gmail", "7674696833"));
        employeeEntities.add(new EmployeeEntity("Sarthak", "Pune", 22, "sarthak@gmail", "7639968962"));
        employeeEntities.add(new EmployeeEntity("Roshan", "Sirsi", 13, "roshan@gmail", "87687483344"));
        employeeEntities.add(new EmployeeEntity("Rohan", "Mumbai", 32, "rohan@gmail", "7639968962"));
        employeeEntities.add(new EmployeeEntity("Sohan", "Delhi", 28, "sohan@gmail", "0935487459-97"));
        employeeEntities.add(new EmployeeEntity("Abhi", "Mangalore", 40, "abhi@gmail", "57700341488"));
        employeeEntities.add(new EmployeeEntity("Kartik", "Delhi", 58, "kartik@gmail", "9393909033"));
        employeeEntities.add(new EmployeeEntity("Rishi", "Bangalore", 12, "rishi@gmail", "3877403793"));
        employeeEntities.add(new EmployeeEntity("Deepak", "Hubali", 62, "dp@gmail", "56136611365"));

        EmployeeService employeeService = new EmployeeServiceImp();
//        employeeService.save(employeeEntities);
        System.out.println("Retrive All..........................................");
        employeeService.getAll().forEach(s-> System.out.println(s));


        System.out.println("Search By Name..........................................");
        EmployeeEntity employee=employeeService.getByName("Vaibhav");
        System.out.println(employee);


        System.out.println("Search By PhNo..........................................");
        EmployeeEntity employee1=employeeService.getByPh("8789902893");
        System.out.println(employee1);

        System.out.println("Search By name and ph..........................................");
        EmployeeEntity employee2=employeeService.getByPhN("8789902893","Chaitanya");
        System.out.println(employee2);




    }
}
