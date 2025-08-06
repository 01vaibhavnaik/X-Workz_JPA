package com.xworkz.chair.service;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.repository.ChairRepo;
import com.xworkz.chair.repository.ChairRepoImp;

public class ChairServiceImp implements ChairService{
    @Override
    public void save(ChairEntity chair) {
        ChairRepo chairRepo=new ChairRepoImp();
        chairRepo.save(chair);
    }
}
