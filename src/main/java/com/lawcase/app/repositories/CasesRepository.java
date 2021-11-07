package com.lawcase.app.repositories;

import com.lawcase.app.model.Cases;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public interface CasesRepository extends CrudRepository<Cases, Integer> {

    @Query("FROM Cases c where c.createdAt >= :from and c.createdAt <= :to")
    Page<Cases> findAll(@Param("from") Date from,
                        @Param("to") Date to, Pageable pageable);

    @Query("FROM Cases c where c.location = :location or c.etapa = :stage or c.estadoProc = :statusProc or c.textoDemanda = :text")
    Page<Cases> searchAll(@Param("location") String location,
                          @Param("stage") String stage,
                          @Param("statusProc") String statusProc,
                          @Param("text") String text,Pageable pageable);


}
