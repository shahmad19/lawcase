package com.lawcase.app.controllers;

import com.lawcase.app.dtos.CasesDTO;
import com.lawcase.app.dtos.SearchDTO;
import com.lawcase.app.model.Anexocau;
import com.lawcase.app.model.Cases;
import com.lawcase.app.services.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CasesController {

    @Autowired
    CasesService casesService;

    @PostMapping("/savecase")
    private void saveCases(@RequestBody Cases cases)
    {
        casesService.saveCases(cases);
    }

    @GetMapping("/getcases")
    private List<Cases> getCases(){
        List<Cases> allCases = casesService.getAllCases();
        return allCases;
    }

    @GetMapping("/getcaselist")
    public ResponseEntity<List<Cases>> getAllCases(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "2021-01-01,2021-12-31") String date)
    {
        List<Cases> list = casesService.getAllCases(pageNo, pageSize, sortBy, date);

        return new ResponseEntity<List<Cases>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping("/searchcase")
    public ResponseEntity<List<Cases>> searchCases(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "") String location,
            @RequestParam(defaultValue = "") String stage,
            @RequestParam(defaultValue = "") String statusProc,
            @RequestParam(defaultValue = "") String text)
    {
        List<Cases> list = casesService.searchCases(pageNo, pageSize, sortBy, location, stage,
                statusProc, text);

        return new ResponseEntity<List<Cases>>(list, new HttpHeaders(), HttpStatus.OK);
    }

    @PostMapping("/searchcases")
    private List<Cases> searchCases(@RequestBody CasesDTO cases,
                                    @RequestParam(defaultValue = "0") Integer pageNo,
                                    @RequestParam(defaultValue = "10") Integer pageSize){
//        SearchDTO<CasesDTO> searchDTO = new SearchDTO<>();
//        PageRequest pageRequest = PageRequest.of(pageNo, pageSize);
//        Page<Cases> casesList = casesService.findAll(pageRequest);
//        return Arrays.asList(searchDTO,
//                new PageImpl<>(systemUsersPage.getContent().stream().map(CasesDTO::new).collect(Collectors.toList()), pageRequest, systemUsersPage.getTotalElements()));
        List<Cases> allCases = casesService.searchAllCases(cases,pageNo, pageSize);
        return allCases;
    }






}
