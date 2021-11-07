package com.lawcase.app.dtos;

public class AnexocauDTO {
    private int id;
    private int caseCrrIdCuaderno;
    private String docUrl;
    private String fecha;
    private String referencia;

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

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
