package com.lawcase.app.services;

import com.lawcase.app.dtos.CasesDTO;
import com.lawcase.app.dtos.TribunalsDTO;
import com.lawcase.app.model.Tribunals;
import com.lawcase.app.repositories.TribunalsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TribunalsService {

    @Autowired
    private TribunalsRepository tribunalsRepository;

    public List<Tribunals> getAllTribunals(){
        List<Tribunals> tribunalsList = new ArrayList<>();

        tribunalsRepository.findAll().forEach(tribunalsList::add);
        return tribunalsList;
    }

    public void saveTribunal(Tribunals tribunals){
        tribunalsRepository.save(tribunals);
    }

    private TribunalsDTO toJSON(Tribunals tribunals) {
        TribunalsDTO tribunalsDTO = new TribunalsDTO();
        tribunalsDTO.setId(tribunals.getId());
        tribunalsDTO.setName(tribunals.getName());
        tribunalsDTO.setValue(tribunals.getValue());
        return tribunalsDTO;
    }

}
