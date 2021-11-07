package com.lawcase.app.services;

import com.lawcase.app.model.Profile;
import com.lawcase.app.repositories.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public void saveProfile(Profile profile){
        profileRepository.save(profile);
    }

    public List<Profile> getAllProfiles(){
        List<Profile> profileList = new ArrayList<>();

        profileRepository.findAll().forEach(profileList::add);
        return profileList;
    }


}
