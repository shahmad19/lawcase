package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "litigantes")
public class Litigantes {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String participante;
    private String rut;
    private String persona;
    private String reason;

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

    
    @Column(name = "Participante")
    public String getParticipante() {
        return participante;
    }

    public void setParticipante(String participante) {
        this.participante = participante;
    }

    
    @Column(name = "Rut")
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    
    @Column(name = "Persona")
    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Litigantes that = (Litigantes) o;

        if (id != that.id) return false;
        if (caseCrrIdCuaderno != that.caseCrrIdCuaderno) return false;
        if (participante != null ? !participante.equals(that.participante) : that.participante != null) return false;
        if (rut != null ? !rut.equals(that.rut) : that.rut != null) return false;
        if (persona != null ? !persona.equals(that.persona) : that.persona != null) return false;
        if (reason != null ? !reason.equals(that.reason) : that.reason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (participante != null ? participante.hashCode() : 0);
        result = 31 * result + (rut != null ? rut.hashCode() : 0);
        result = 31 * result + (persona != null ? persona.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        return result;
    }
}
