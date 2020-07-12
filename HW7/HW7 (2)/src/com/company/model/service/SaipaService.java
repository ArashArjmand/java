package com.company.model.service;

import com.company.model.entity.SaipaEntity;
import com.company.model.repository.SaipaRepository;

public class SaipaService {
    private static SaipaService ourInstance = new SaipaService();

    public static SaipaService getInstance(){ return ourInstance; }

    private SaipaService(){}

    public void save(SaipaEntity entity) throws Exception{
        SaipaRepository repository = new SaipaRepository();
        repository.insert(entity);
        repository.commit();
        repository.close();
    }

}
