package com.lawcase.app.repositories;

import com.lawcase.app.model.Historia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaRepository extends CrudRepository<Historia, Integer> {
}
