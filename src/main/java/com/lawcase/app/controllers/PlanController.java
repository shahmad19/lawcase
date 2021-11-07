package com.lawcase.app.controllers;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Plans;
import com.lawcase.app.services.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlanController {

    @Autowired
    PlanService planService;

    @PostMapping("/saveplan")
    private void savePlan(@RequestBody Plans plan)
    {
        planService.savePlan(plan);
    }

    @GetMapping("/getplans")
    private List<Plans> getPlans(@RequestParam(defaultValue = "0") Integer pageNo,
                                 @RequestParam(defaultValue = "10") Integer pageSize){
        List<Plans> allPlans = planService.getAllPlans(pageNo, pageSize);
        return allPlans;
    }

}
