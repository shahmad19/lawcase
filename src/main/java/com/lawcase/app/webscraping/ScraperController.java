package com.lawcase.app.webscraping;

import com.lawcase.app.model.Cases;
import com.lawcase.app.services.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/webscrap")
public class ScraperController {

    @Autowired
    ScraperService scraperService;
    @Autowired
    CasesService casesService;

    //List all the authors
    @GetMapping("/cases")
    public void listCases() {
        List<CasesData> casesDataList = new ArrayList<>();
        casesDataList = scraperService.extractCases();
//        for(Cases case : casesDataList){
//            casesService.saveCases(case);
//        }
        System.out.println("Total Cases: " + casesDataList.size());

    }

}
