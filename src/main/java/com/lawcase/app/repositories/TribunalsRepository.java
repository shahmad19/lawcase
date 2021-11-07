package com.lawcase.app.repositories;

import com.lawcase.app.model.Tribunals;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TribunalsRepository extends CrudRepository<Tribunals, Integer> {
}
