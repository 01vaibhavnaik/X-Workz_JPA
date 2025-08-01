package com.xworkz.roomrent.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@AllArgsConstructor
@ToString
@Setter
@Getter
@Entity
@Table(name = "rentroom")
public class RoomRentEntity {
    public RoomRentEntity(){

    }
    @Id
    private int id;

    @Column(name = "roomname")
    private String roomName;

    @Column(name = "roomlocation")
    private String roomLocation;


}
