package com.xworkz.chair.service;

import com.xworkz.chair.entity.ChairEntity;
import com.xworkz.chair.repository.ChairRepo;
import com.xworkz.chair.repository.ChairRepoImp;

import java.util.List;

public class ChairServiceImp implements ChairService{
    @Override
    public void save(ChairEntity chair) {
        ChairRepo chairRepo=new ChairRepoImp();
        chairRepo.save(chair);
    }

    @Override
    public void saves(List<ChairEntity> list) {
        ChairRepo chairRepo=new ChairRepoImp();
        chairRepo.saves(list);
    }
}
