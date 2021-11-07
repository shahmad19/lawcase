package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "notificaciones")
public class Notificaciones {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String estaNot;
    private String rol;
    private String ruc;
    private String fecTram;
    private String tipPart;
    private String nombre;
    private String tramite;
    private String obsFallida;

    @Id @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name = "case_CRR_IdCuaderno")
    public int getCaseCrrIdCuaderno() {
        return caseCrrIdCuaderno;
    }

    public void setCaseCrrIdCuaderno(int caseCrrIdCuaderno) {
        this.caseCrrIdCuaderno = caseCrrIdCuaderno;
    }

    
    @Column(name = "Esta_Not")
    public String getEstaNot() {
        return estaNot;
    }

    public void setEstaNot(String estaNot) {
        this.estaNot = estaNot;
    }

    
    @Column(name = "ROL")
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
    @Column(name = "RUC")
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    
    @Column(name = "Fec_Tram")
    public String getFecTram() {
        return fecTram;
    }

    public void setFecTram(String fecTram) {
        this.fecTram = fecTram;
    }

    
    @Column(name = "Tip_Part")
    public String getTipPart() {
        return tipPart;
    }

    public void setTipPart(String tipPart) {
        this.tipPart = tipPart;
    }

    
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name = "Tramite")
    public String getTramite() {
        return tramite;
    }

    public void setTramite(String tramite) {
        this.tramite = tramite;
    }

    
    @Column(name = "Obs_Fallida")
    public String getObsFallida() {
        return obsFallida;
    }

    public void setObsFallida(String obsFallida) {
        this.obsFallida = obsFallida;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Notificaciones that = (Notificaciones) o;

        if (id != that.id) return false;
        if (caseCrrIdCuaderno != that.caseCrrIdCuaderno) return false;
        if (estaNot != null ? !estaNot.equals(that.estaNot) : that.estaNot != null) return false;
        if (rol != null ? !rol.equals(that.rol) : that.rol != null) return false;
        if (ruc != null ? !ruc.equals(that.ruc) : that.ruc != null) return false;
        if (fecTram != null ? !fecTram.equals(that.fecTram) : that.fecTram != null) return false;
        if (tipPart != null ? !tipPart.equals(that.tipPart) : that.tipPart != null) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (tramite != null ? !tramite.equals(that.tramite) : that.tramite != null) return false;
        if (obsFallida != null ? !obsFallida.equals(that.obsFallida) : that.obsFallida != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (estaNot != null ? estaNot.hashCode() : 0);
        result = 31 * result + (rol != null ? rol.hashCode() : 0);
        result = 31 * result + (ruc != null ? ruc.hashCode() : 0);
        result = 31 * result + (fecTram != null ? fecTram.hashCode() : 0);
        result = 31 * result + (tipPart != null ? tipPart.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (tramite != null ? tramite.hashCode() : 0);
        result = 31 * result + (obsFallida != null ? obsFallida.hashCode() : 0);
        return result;
    }
}
