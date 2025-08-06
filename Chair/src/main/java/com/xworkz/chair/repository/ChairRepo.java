package com.xworkz.chair.repository;

import com.xworkz.chair.entity.ChairEntity;

import java.util.List;

public interface ChairRepo {
    public void save(ChairEntity chair);

    public void saves(List<ChairEntity> list);

}
