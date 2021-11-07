package com.lawcase.app.services;

import com.lawcase.app.repositories.HistoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoriaService {

    @Autowired
    HistoriaRepository historiaRepository;
}
