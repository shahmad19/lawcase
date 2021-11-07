package com.lawcase.app.services;

import com.lawcase.app.repositories.EscritosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EscritosService {

    @Autowired
    EscritosRepository escritosRepository;

}
