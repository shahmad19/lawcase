package com.lawcase.app.controllers;

import com.lawcase.app.dtos.LoginDTO;
import com.lawcase.app.dtos.PasswordDTO;
import com.lawcase.app.model.Notificaciones;
import com.lawcase.app.model.User;
import com.lawcase.app.services.NotificacionesService;
import com.lawcase.app.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/registration")
    private void saveUser(@RequestBody User user)
    {
        userService.saveUser(user);
    }

    @PostMapping("/changepassword")
    private String changePassword(@RequestBody PasswordDTO passwordDTO){

        String message = userService.changePassword(passwordDTO);
        return message;
    }

    @PostMapping("/login")
    private String login(@RequestBody LoginDTO loginDTO){

        String message = userService.login(loginDTO);
        return message;
    }


}
