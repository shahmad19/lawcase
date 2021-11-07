package com.lawcase.app.services;

import com.lawcase.app.dtos.LoginDTO;
import com.lawcase.app.dtos.PasswordDTO;
import com.lawcase.app.model.User;
import com.lawcase.app.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void saveUser(User user) {

        userRepository.save(user);
    }

    public User findByEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user;
    }

    public String changePassword(PasswordDTO passwordDTO) {
        User user = userRepository.findByEmail(passwordDTO.getEmail());
        if (user == null) {
            return "User Not Found";
        } else {
            if (user.getPassword().equals(passwordDTO.getExistingPassword())
                    && passwordDTO.getNewPassword().equals(passwordDTO.getNewPasswordConfirm())) {
                user.setPassword(passwordDTO.getNewPassword());
            } else {
                return "User or Password is Incorrect";
            }
            userRepository.save(user);
        }
        return "Success";
    }

    public String login(LoginDTO loginDTO) {
        User user = userRepository.findByEmail(loginDTO.getEmail());
        if (user == null) {
            return "User is Not Registered";
        } else {
            if (user.getPassword().equals(loginDTO.getPassword())) {
                return "Logged in successfully";
            } else {
                return "User or Password is Incorrect";
            }
        }
    }

}
