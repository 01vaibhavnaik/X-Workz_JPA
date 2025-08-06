package com.xworkz.chair.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "chair")
public class ChairEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "chairbrand")
    private String chairBrand;
    @Column(name = "chairprice")
    private int chairPrice;
    @Column(name = "chaircolor")
    private String chairColor;

    public ChairEntity(String chairBrand, int chairPrice, String chairColor) {
        this.chairBrand = chairBrand;
        this.chairPrice = chairPrice;
        this.chairColor = chairColor;
    }
}
