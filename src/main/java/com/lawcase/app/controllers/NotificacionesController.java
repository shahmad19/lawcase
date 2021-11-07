package com.lawcase.app.controllers;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Notificaciones;
import com.lawcase.app.services.NotificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NotificacionesController {

    @Autowired
    NotificacionesService notificacionesService;

    @PostMapping("/savenotification")
    private void saveNotificaciones(@RequestBody Notificaciones notificaciones)
    {
        notificacionesService.saveNotificacione(notificaciones);
    }

    @GetMapping("/getnotifications")
    private List<Notificaciones> getNotificaciones(@RequestParam(defaultValue = "0") Integer pageNo,
                                                   @RequestParam(defaultValue = "10") Integer pageSize){
        List<Notificaciones> allNotificaciones = notificacionesService.getAllNotificaciones(pageNo, pageSize);
        return allNotificaciones;
    }

}
