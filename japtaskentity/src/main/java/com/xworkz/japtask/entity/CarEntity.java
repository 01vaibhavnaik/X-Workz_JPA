package com.xworkz.japtask.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@Getter
@ToString
@Entity
@Table(name = "car")
public class CarEntity {

    public CarEntity(){

    }
    @Id
    private int id;
    @Column(name = "carname")
    private String carName;
    @Column(name = "carprice")
    private String carPrice;


}
