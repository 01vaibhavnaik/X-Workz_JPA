package com.xworkz.pant.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@AllArgsConstructor
@ToString
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "pant")
public class PantEntity {

    @Id
    private int id;
    private String brandname;
    private String color;

}