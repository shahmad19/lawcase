package com.lawcase.app.services;

import com.lawcase.app.model.Anexocau;
import com.lawcase.app.model.Tribunals;
import com.lawcase.app.repositories.AnexocauRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnexocauService {

    @Autowired
    AnexocauRepository anexocauRepository;

    public List<Anexocau> getAllAnexocau(){
        List<Anexocau> anexocauList = new ArrayList<>();

        anexocauRepository.findAll().forEach(anexocauList::add);
        return anexocauList;
    }

    public void saveAnexocau(Anexocau anexocau){
        anexocauRepository.save(anexocau);
    }

}
