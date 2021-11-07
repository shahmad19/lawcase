package com.lawcase.app.dtos;

public class NotificacionesDTO {
    private int id;
    private int caseCrrIdCuaderno;
    private String estaNot;
    private String rol;
    private String ruc;
    private String fecTram;
    private String tipPart;
    private String nombre;
    private String tramite;
    private String obsFallida;

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

    public String getEstaNot() {
        return estaNot;
    }

    public void setEstaNot(String estaNot) {
        this.estaNot = estaNot;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFecTram() {
        return fecTram;
    }

    public void setFecTram(String fecTram) {
        this.fecTram = fecTram;
    }

    public String getTipPart() {
        return tipPart;
    }

    public void setTipPart(String tipPart) {
        this.tipPart = tipPart;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    public String getObsFallida() {
        return obsFallida;
    }

    public void setObsFallida(String obsFallida) {
        this.obsFallida = obsFallida;
    }
}
