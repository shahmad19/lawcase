package com.lawcase.app.dtos;

import javax.persistence.*;

public class HistoriaDTO {
    private int id;
    private int caseCrrIdCuaderno;
    private String url;
    private String anexo;
    private String etapa;
    private String nameProcedure;
    private String descProcedure;
    private String dateTram;
    private int foja;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaseCrrIdCuaderno() {
        return caseCrrIdCuaderno;
    }

    public void setCaseCrrIdCuaderno(int caseCrrIdCuaderno) {
        this.caseCrrIdCuaderno = caseCrrIdCuaderno;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getNameProcedure() {
        return nameProcedure;
    }

    public void setNameProcedure(String nameProcedure) {
        this.nameProcedure = nameProcedure;
    }

    public String getDescProcedure() {
        return descProcedure;
    }

    public void setDescProcedure(String descProcedure) {
        this.descProcedure = descProcedure;
    }

    public String getDateTram() {
        return dateTram;
    }

    public void setDateTram(String dateTram) {
        this.dateTram = dateTram;
    }

    public int getFoja() {
        return foja;
    }

    public void setFoja(int foja) {
        this.foja = foja;
    }
}
