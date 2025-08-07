package com.xworkz.employee.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employee_details")
@NoArgsConstructor
@Data
@ToString
@NamedQuery(name = "getAll",query = "select entity from EmployeeEntity entity ")
@NamedQuery(name = "getByName",query = "select entity from EmployeeEntity entity where employeeName =: personName")
@NamedQuery(name = "getByPh",query = "select entity from EmployeeEntity entity where employeePhNo =:PhNo")
@NamedQuery(name = "getByPhN",query = "select entity from EmployeeEntity entity where employeePhNo =:PhNos and employeeName =:Name")

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY )
    private  int employeeid;
    @Column(name = "employeename")
    private String employeeName;
    @Column(name = "companyloc")
    private String companyLoc;
    @Column(name = "employeeage")
    private int employeeAge;
    @Column(name = "employeeemail")
    private String employeeEmail;
    @Column(name = "employeephno")
    private String employeePhNo;

    public EmployeeEntity(String employeeName, String companyLoc, int employeeAge, String employeeEmail, String employeePhNo) {
        this.employeeName = employeeName;
        this.companyLoc = companyLoc;
        this.employeeAge = employeeAge;
        this.employeeEmail = employeeEmail;
        this.employeePhNo = employeePhNo;
    }




}
