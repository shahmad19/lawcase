package com.lawcase.app.services;

import com.lawcase.app.model.Cases;
import com.lawcase.app.model.Notificaciones;
import com.lawcase.app.model.Plans;
import com.lawcase.app.repositories.NotificacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NotificacionesService {

    @Autowired
    NotificacionesRepository notificacionesRepository;

    public void saveNotificacione(Notificaciones notificaciones){
        notificacionesRepository.save(notificaciones);
    }

    public List<Notificaciones> getAllNotificaciones(Integer pageNo, Integer pageSize){
        Pageable paging = PageRequest.of(pageNo, pageSize);

        Page<Notificaciones> pagedResult = notificacionesRepository.findAll(paging);

        if(pagedResult.hasContent()) {
            return pagedResult.getContent();
        } else {
            return new ArrayList<Notificaciones>();
        }
    }

}
