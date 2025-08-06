package com.xworkz.chair.service;

import com.xworkz.chair.entity.ChairEntity;

import java.util.List;

public interface ChairService {

    public void save(ChairEntity chair);

    public void saves(List<ChairEntity> list);

}
