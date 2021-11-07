package com.lawcase.app.controllers;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Profile;
import com.lawcase.app.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    ProfileService profileService;

    @PostMapping("/saveprofile")
    private void saveProfile(@RequestBody Profile profile)
    {
        profileService.saveProfile(profile);
    }

    @GetMapping("/getprofiles")
    private List<Profile> getCases(){
        List<Profile> allProfile = profileService.getAllProfiles();
        return allProfile;
    }

}
