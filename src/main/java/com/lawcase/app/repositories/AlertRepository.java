package com.lawcase.app.repositories;

import com.lawcase.app.model.Alerts;
import org.springframework.data.repository.CrudRepository;

public interface AlertRepository extends CrudRepository<Alerts, Integer> {
}
