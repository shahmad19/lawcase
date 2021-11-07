package com.lawcase.app.dtos;

public class ExhortoDTO {
    private int id;
    private int caseCrrIdCuaderno;
    private String rolOrigen;
    private String tipoExhorto;
    private String rolDestino;
    private String fecOrdenaExhorto;
    private String fecIngExhorto;
    private String tribunalDestino;
    private String estadoExhorto;

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

    public String getRolOrigen() {
        return rolOrigen;
    }

    public void setRolOrigen(String rolOrigen) {
        this.rolOrigen = rolOrigen;
    }

    public String getTipoExhorto() {
        return tipoExhorto;
    }

    public void setTipoExhorto(String tipoExhorto) {
        this.tipoExhorto = tipoExhorto;
    }

    public String getRolDestino() {
        return rolDestino;
    }

    public void setRolDestino(String rolDestino) {
        this.rolDestino = rolDestino;
    }

    public String getFecOrdenaExhorto() {
        return fecOrdenaExhorto;
    }

    public void setFecOrdenaExhorto(String fecOrdenaExhorto) {
        this.fecOrdenaExhorto = fecOrdenaExhorto;
    }

    public String getFecIngExhorto() {
        return fecIngExhorto;
    }

    public void setFecIngExhorto(String fecIngExhorto) {
        this.fecIngExhorto = fecIngExhorto;
    }

    public String getTribunalDestino() {
        return tribunalDestino;
    }

    public void setTribunalDestino(String tribunalDestino) {
        this.tribunalDestino = tribunalDestino;
    }

    public String getEstadoExhorto() {
        return estadoExhorto;
    }

    public void setEstadoExhorto(String estadoExhorto) {
        this.estadoExhorto = estadoExhorto;
    }
}
