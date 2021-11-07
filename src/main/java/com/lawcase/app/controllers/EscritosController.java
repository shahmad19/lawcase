package com.lawcase.app.controllers;

import com.lawcase.app.services.EscritosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EscritosController {

    @Autowired
    EscritosService escritosService;

}
