package com.lawcase.app.repositories;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Plans;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface PlanRepository extends CrudRepository<Plans, Integer> {

    Page<Plans> findAll(Pageable pageable);

}
