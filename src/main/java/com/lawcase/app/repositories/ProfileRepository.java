package com.lawcase.app.repositories;

import com.lawcase.app.model.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile, Integer> {
}
