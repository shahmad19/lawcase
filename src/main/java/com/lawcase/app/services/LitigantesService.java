package com.lawcase.app.services;

import com.lawcase.app.repositories.LitigantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LitigantesService {

    @Autowired
    LitigantesRepository litigantesRepository;
}
