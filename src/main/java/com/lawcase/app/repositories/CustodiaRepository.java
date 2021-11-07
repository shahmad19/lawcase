package com.lawcase.app.repositories;

import com.lawcase.app.model.Custodia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustodiaRepository extends CrudRepository<Custodia, Integer> {
}
