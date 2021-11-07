package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "anexocau")
public class Anexocau {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String docUrl;
    private String fecha;
    private String referencia;

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

    
    @Column(name = "Doc_url")
    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }

    
    @Column(name = "Fecha")
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    @Column(name = "Referencia")
    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Anexocau anexocau = (Anexocau) o;

        if (id != anexocau.id) return false;
        if (caseCrrIdCuaderno != anexocau.caseCrrIdCuaderno) return false;
        if (docUrl != null ? !docUrl.equals(anexocau.docUrl) : anexocau.docUrl != null) return false;
        if (fecha != null ? !fecha.equals(anexocau.fecha) : anexocau.fecha != null) return false;
        if (referencia != null ? !referencia.equals(anexocau.referencia) : anexocau.referencia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (docUrl != null ? docUrl.hashCode() : 0);
        result = 31 * result + (fecha != null ? fecha.hashCode() : 0);
        result = 31 * result + (referencia != null ? referencia.hashCode() : 0);
        return result;
    }
}
