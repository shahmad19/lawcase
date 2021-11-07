package com.lawcase.app.repositories;

import com.lawcase.app.model.Anexocau;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnexocauRepository extends CrudRepository<Anexocau, Integer> {
}
