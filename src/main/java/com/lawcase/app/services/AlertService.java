package com.lawcase.app.services;

import com.lawcase.app.model.Alerts;
import com.lawcase.app.model.Profile;
import com.lawcase.app.repositories.AlertRepository;
import com.lawcase.app.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlertService {

    @Autowired
    AlertRepository alertRepository;

    public void saveAlerts(Alerts alerts){
        alertRepository.save(alerts);
    }

    public List<Alerts> getAllAlerts(){
        List<Alerts> alertsList = new ArrayList<>();

        alertRepository.findAll().forEach(alertsList::add);
        return alertsList;
    }

}
