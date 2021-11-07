package com.lawcase.app.repositories;

import com.lawcase.app.model.Notificaciones;
import com.lawcase.app.model.Plans;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificacionesRepository extends CrudRepository<Notificaciones, Integer> {

    Page<Notificaciones> findAll(Pageable pageable);
}
