package com.lawcase.app.repositories;

import com.lawcase.app.model.Litigantes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LitigantesRepository extends CrudRepository<Litigantes, Integer> {
}
