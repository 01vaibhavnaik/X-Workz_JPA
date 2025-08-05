package com.xworkz.company.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CompanyEntity {
    @Id
    private int companyid;
    private String companyname;
    private int noofemp;
}
