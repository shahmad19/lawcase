package com.lawcase.app.services;

import com.lawcase.app.repositories.CustodiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustodiaService {

    @Autowired
    CustodiaRepository custodiaRepository;

}
