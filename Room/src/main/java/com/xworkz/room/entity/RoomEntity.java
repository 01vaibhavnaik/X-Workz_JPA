package com.xworkz.room.entity;

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
@Table(name = "room")
public class RoomEntity {
    public RoomEntity(){

    }
    @Id
    private int idroom;
    private  String roomname;
    private int sqinmtr;
}
