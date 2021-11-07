package com.lawcase.app.repositories;

import com.lawcase.app.model.Exhorto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExhortoRepository extends CrudRepository<Exhorto, Integer> {
}
