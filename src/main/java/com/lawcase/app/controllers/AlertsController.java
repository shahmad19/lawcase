package com.lawcase.app.controllers;

import com.lawcase.app.model.Alerts;
import com.lawcase.app.model.Tribunals;
import com.lawcase.app.services.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlertsController {
    @Autowired
    AlertService alertService;

    @PostMapping("/savealert")
    private void saveAlert(@RequestBody Alerts alerts)
    {
        alertService.saveAlerts(alerts);
    }

    @GetMapping("/getalerts")
    private List<Alerts> getAlerts(){
        List<Alerts> allAlerts = alertService.getAllAlerts();
        return allAlerts;
    }

    @GetMapping("/welcome")
    private String welcome(){
        return "welcome";
    }

}
