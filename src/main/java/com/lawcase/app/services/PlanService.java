package com.lawcase.app.services;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Plans;
import com.lawcase.app.repositories.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PlanService {
    @Autowired
    PlanRepository planRepository;

    public List<Plans> getAllPlans(Integer pageNo, Integer pageSize){
        Pageable paging = PageRequest.of(pageNo, pageSize);

        Page<Plans> pagedResult = planRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Plans>();
        }
    }

    public void savePlan(Plans plan){
        planRepository.save(plan);
    }


}
