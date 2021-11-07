package com.lawcase.app.controllers;

import com.lawcase.app.services.LitigantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LitigantesController {

    @Autowired
    LitigantesService litigantesService;

}
