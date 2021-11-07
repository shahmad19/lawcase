package com.lawcase.app.services;

import com.lawcase.app.dtos.CasesDTO;
import com.lawcase.app.model.Cases;
import com.lawcase.app.repositories.CasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CasesService {

    @Autowired
    CasesRepository casesRepository;

    public List<Cases> getAllCases(){
        List<Cases> casesList = new ArrayList<>();

        casesRepository.findAll().forEach(casesList::add);
        return casesList;
    }

    public void saveCases(Cases cases){
        casesRepository.save(cases);
    }

    public List<Cases> getAllCases(Integer pageNo, Integer pageSize, String sortBy, String date) {
        Pageable paging = PageRequest.of(pageNo, pageSize, Sort.by(sortBy));
        Date fromDate = null;
        Date toDate = null;
        try {
            fromDate = new SimpleDateFormat("yyyy-MM-dd").parse(date.split(",")[0]);
            toDate = new SimpleDateFormat("yyyy-MM-dd").parse(date.split(",")[1]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Page<Cases> pagedResult = casesRepository.findAll(fromDate, toDate, paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Cases>();
        }
    }

    public List<Cases> searchCases(Integer pageNo, Integer pageSize, String sortBy, String location, String stage,
                                   String statusProc,String text) {
        Pageable paging = PageRequest.of(pageNo, pageSize);

        Page<Cases> pagedResult = casesRepository.searchAll(location, stage, statusProc, text, paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Cases>();
        }
    }

    public List<Cases> searchAllCases(CasesDTO casesDTO, Integer pageNo, Integer pageSize) {
        Pageable paging = PageRequest.of(pageNo, pageSize);

//        Page<Cases> pagedResult = casesRepository.searchAll(location, stage, statusProc, text, paging);
//
//        if(pagedResult.hasContent()) {
//            return pagedResult.getContent();
//        } else {
//            return new ArrayList<Cases>();
//        }
        return new ArrayList<Cases>();
    }


}
