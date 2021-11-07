package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "escritos")
public class Escritos {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String doc;
    private String anexo;
    private String fechaIng;
    private String tipoEscrito;
    private String solicitante;

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

    
    @Column(name = "Doc")
    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    
    @Column(name = "Anexo")
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    
    @Column(name = "Fecha_Ing")
    public String getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(String fechaIng) {
        this.fechaIng = fechaIng;
    }

    
    @Column(name = "Tipo_Escrito")
    public String getTipoEscrito() {
        return tipoEscrito;
    }

    public void setTipoEscrito(String tipoEscrito) {
        this.tipoEscrito = tipoEscrito;
    }

    
    @Column(name = "Solicitante")
    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Escritos escritos = (Escritos) o;

        if (id != escritos.id) return false;
        if (caseCrrIdCuaderno != escritos.caseCrrIdCuaderno) return false;
        if (doc != null ? !doc.equals(escritos.doc) : escritos.doc != null) return false;
        if (anexo != null ? !anexo.equals(escritos.anexo) : escritos.anexo != null) return false;
        if (fechaIng != null ? !fechaIng.equals(escritos.fechaIng) : escritos.fechaIng != null) return false;
        if (tipoEscrito != null ? !tipoEscrito.equals(escritos.tipoEscrito) : escritos.tipoEscrito != null)
            return false;
        if (solicitante != null ? !solicitante.equals(escritos.solicitante) : escritos.solicitante != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (doc != null ? doc.hashCode() : 0);
        result = 31 * result + (anexo != null ? anexo.hashCode() : 0);
        result = 31 * result + (fechaIng != null ? fechaIng.hashCode() : 0);
        result = 31 * result + (tipoEscrito != null ? tipoEscrito.hashCode() : 0);
        result = 31 * result + (solicitante != null ? solicitante.hashCode() : 0);
        return result;
    }
}
