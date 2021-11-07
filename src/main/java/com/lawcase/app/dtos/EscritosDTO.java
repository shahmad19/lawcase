package com.lawcase.app.dtos;

public class EscritosDTO {
    private int id;
    private int caseCrrIdCuaderno;
    private String doc;
    private String anexo;
    private String fechaIng;
    private String tipoEscrito;
    private String solicitante;

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

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    public String getTipoEscrito() {
        return tipoEscrito;
    }

    public void setTipoEscrito(String tipoEscrito) {
        this.tipoEscrito = tipoEscrito;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }
}
