package com.lawcase.app.controllers;

import com.lawcase.app.model.Anexocau;
import com.lawcase.app.model.Tribunals;
import com.lawcase.app.services.AnexocauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnexocauController {

    @Autowired
    AnexocauService anexocauService;

    @PostMapping("/saveanexocau")
    private void saveAnexocau(@RequestBody Anexocau anexocau)
    {
        anexocauService.saveAnexocau(anexocau);
    }

    @GetMapping("/getanexocau")
    private List<Anexocau> getAnexocau(){
        List<Anexocau> allAnexocau = anexocauService.getAllAnexocau();
        return allAnexocau;
    }

}
