package com.xworkz.chair.runner;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.service.ChairService;
import com.xworkz.chair.service.ChairServiceImp;

import java.util.ArrayList;
import java.util.List;

public class ChairRunner {
    public static void main(String[] args) {

//        ChairEntity chair=new ChairEntity("Abhi", 150,"Cream");
//
//        ChairService chairService=new ChairServiceImp();
//        chairService.save(chair);
        List<ChairEntity> chair=new ArrayList<>();
        chair.add(new ChairEntity("Abh", 150,"Cream"));
        chair.add(new ChairEntity("rosan", 130,"Cream"));
        chair.add(new ChairEntity("rohan", 450,"white"));
        chair.add(new ChairEntity("sohan", 100,"Cream"));
        chair.add(new ChairEntity("sarthak", 110,"black"));

        ChairService chairService=new ChairServiceImp();
        chairService.saves(chair);
    }
}
