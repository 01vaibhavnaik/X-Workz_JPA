package com.xworkz.trip.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Table(name = "trip_details")
@NamedQuery(name = "getAll",query = "select e from TripEntity e ")
@NamedQuery(name = "getByName",query = "select entity from TripEntity entity where triplocation = place")
public class TripEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tripid;
    private String triplocation;
    private String tripdate;
    private int days;
    private String email;

    public TripEntity(String triplocation, String tripdate, int days, String email) {
        this.triplocation = triplocation;
        this.tripdate = tripdate;
        this.days = days;
        this.email = email;
    }
}
