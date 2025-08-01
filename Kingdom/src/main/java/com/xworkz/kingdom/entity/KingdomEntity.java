package com.xworkz.kingdom.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "kingdom")
public class KingdomEntity {

    public KingdomEntity(){

    }
    @Id
    private int id;
    private String kingname;
    private String kingdomname;

}
