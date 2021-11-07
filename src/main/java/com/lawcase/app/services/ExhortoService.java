package com.lawcase.app.services;

import com.lawcase.app.repositories.ExhortoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExhortoService {

    @Autowired
    ExhortoRepository exhortoRepository;
}
