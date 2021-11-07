package com.lawcase.app.controllers;

import com.lawcase.app.model.Tribunals;
import com.lawcase.app.services.TribunalsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TribunalsController {

    @Autowired
    private TribunalsService tribunalsService;

    @PostMapping("/savetribunal")
    private void saveTribunal(@RequestBody Tribunals tribunals)
    {
        tribunalsService.saveTribunal(tribunals);
    }

    @GetMapping("/gettribunals")
    private List<Tribunals> getTribunals(){
        List<Tribunals> allTribunals = tribunalsService.getAllTribunals();
        return allTribunals;
    }

}
