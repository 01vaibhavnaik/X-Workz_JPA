package com.xworkz.chair.runner;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.service.ChairService;
import com.xworkz.chair.service.ChairServiceImp;

public class ChairRunner {
    public static void main(String[] args) {

        ChairEntity chair=new ChairEntity("Abhi", 150,"Cream");

        ChairService chairService=new ChairServiceImp();
        chairService.save(chair);
    }
}
