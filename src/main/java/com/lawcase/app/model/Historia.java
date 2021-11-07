package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "historia")
public class Historia {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String url;
    private String anexo;
    private String etapa;
    private String nameProcedure;
    private String descProcedure;
    private String dateTram;
    private int foja;

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

    
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name = "Anexo")
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    
    @Column(name = "Etapa")
    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    
    @Column(name = "Name_procedure")
    public String getNameProcedure() {
        return nameProcedure;
    }

    public void setNameProcedure(String nameProcedure) {
        this.nameProcedure = nameProcedure;
    }

    
    @Column(name = "Desc_procedure")
    public String getDescProcedure() {
        return descProcedure;
    }

    public void setDescProcedure(String descProcedure) {
        this.descProcedure = descProcedure;
    }

    
    @Column(name = "Date_Tram")
    public String getDateTram() {
        return dateTram;
    }

    public void setDateTram(String dateTram) {
        this.dateTram = dateTram;
    }

    
    @Column(name = "Foja")
    public int getFoja() {
        return foja;
    }

    public void setFoja(int foja) {
        this.foja = foja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Historia historia = (Historia) o;

        if (id != historia.id) return false;
        if (caseCrrIdCuaderno != historia.caseCrrIdCuaderno) return false;
        if (foja != historia.foja) return false;
        if (url != null ? !url.equals(historia.url) : historia.url != null) return false;
        if (anexo != null ? !anexo.equals(historia.anexo) : historia.anexo != null) return false;
        if (etapa != null ? !etapa.equals(historia.etapa) : historia.etapa != null) return false;
        if (nameProcedure != null ? !nameProcedure.equals(historia.nameProcedure) : historia.nameProcedure != null)
            return false;
        if (descProcedure != null ? !descProcedure.equals(historia.descProcedure) : historia.descProcedure != null)
            return false;
        if (dateTram != null ? !dateTram.equals(historia.dateTram) : historia.dateTram != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (anexo != null ? anexo.hashCode() : 0);
        result = 31 * result + (etapa != null ? etapa.hashCode() : 0);
        result = 31 * result + (nameProcedure != null ? nameProcedure.hashCode() : 0);
        result = 31 * result + (descProcedure != null ? descProcedure.hashCode() : 0);
        result = 31 * result + (dateTram != null ? dateTram.hashCode() : 0);
        result = 31 * result + foja;
        return result;
    }
}
