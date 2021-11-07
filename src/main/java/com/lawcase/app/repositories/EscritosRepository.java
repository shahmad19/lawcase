package com.lawcase.app.repositories;

import com.lawcase.app.model.Escritos;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscritosRepository extends CrudRepository<Escritos, Integer> {
}
