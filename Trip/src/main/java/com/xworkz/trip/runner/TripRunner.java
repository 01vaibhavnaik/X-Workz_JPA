package com.xworkz.trip.runner;

import com.xworkz.trip.entity.TripEntity;
import com.xworkz.trip.repository.TripRepository;
import com.xworkz.trip.repository.TripRepositoryImp;
import com.xworkz.trip.service.TripService;
import com.xworkz.trip.service.TripServiceImp;

import java.util.ArrayList;
import java.util.List;

public class TripRunner {

    public static void main(String[] args) {
        List<TripEntity> trip=new ArrayList<>();
        trip.add(new TripEntity("Sakleshpur","2023-10-01", 3, "vaibhav@com"));
        trip.add(new TripEntity("Coorg","2023-10-05", 4,"chandana@com"));
        trip.add(new TripEntity("Chikmagalur","2023-10-10", 2, "priya@com"));
        trip.add(new TripEntity("Mysore","2023-10-15", 1, "arun@com"));
        trip.add(new TripEntity("Hampi","2023-10-20", 5, "suresh@com"));
        trip.add(new TripEntity("Gokarna","2023-10-25", 3, "nisha@com"));
        trip.add(new TripEntity("Ooty","2023-10-30", 4, "rajesh@com"));
        trip.add(new TripEntity("Kodaikanal","2023-11-01", 6, "anita@com"));
        trip.add(new TripEntity("Wayanad","2023-11-05", 2, "deepak@com"));
        trip.add(new TripEntity("Mahabaleshwar","2023-11-10", 3, "sneha@com"));
        trip.add(new TripEntity("Lonavala","2023-11-15", 4, "kiran@com"));
        trip.add(new TripEntity("Alleppey","2023-11-20", 5, "pradeep@com"));
        trip.add(new TripEntity("Rishikesh","2023-11-25", 7, "meera@com"));
        trip.add(new TripEntity("Shimla","2023-12-01", 8, "raju@com"));
        trip.add(new TripEntity("Manali","2023-12-05", 6, "sita@com"));
        trip.add(new TripEntity("Darjeeling","2023-12-10", 5, "vikas@com"));
        trip.add(new TripEntity("Andaman","2023-12-15", 10, "neha@com"));
        trip.add(new TripEntity("Goa","2023-12-20", 7, "amit@com"));
        trip.add(new TripEntity("Kumarakom","2023-12-25", 4, "sanjay@com"));
        trip.add(new TripEntity("Mount Abu","2023-12-30", 3, "pooja@com"));
        trip.add(new TripEntity("Ajmer","2024-01-05", 2, "rahul@com"));
        trip.add(new TripEntity("Jaisalmer","2024-01-10", 5, "anil@com"));
        trip.add(new TripEntity("Udaipur","2024-01-15", 6, "geeta@com"));
        trip.add(new TripEntity("Jodhpur","2024-01-20", 4, "ravi@com"));
        trip.add(new TripEntity("Kolkata","2024-01-25", 3, "suman@com"));


        TripService tripService=new TripServiceImp();
//        tripService.save(trip);

        System.out.println();
        System.out.println("Retrive All Data...............");
        tripService.getAll().forEach(s-> System.out.println(s));

        System.out.println();
        System.out.println("Retrive By Name...............");
        TripEntity tripEntity=tripService.getByName("Goa");
        System.out.println(tripEntity);




    }
}
