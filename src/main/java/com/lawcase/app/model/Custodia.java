package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "custodia")
public class Custodia {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String nMovimiento;
    private String fechaIngreso;
    private String horaIngreso;
    private String usuarioIngreso;
    private String observacion;

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

    @Column(name = "N_Movimiento")
    public String getnMovimiento() {
        return nMovimiento;
    }

    public void setnMovimiento(String nMovimiento) {
        this.nMovimiento = nMovimiento;
    }

    @Column(name = "Fecha_Ingreso")
    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Column(name = "Hora_Ingreso")
    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    @Column(name = "Usuario_Ingreso")
    public String getUsuarioIngreso() {
        return usuarioIngreso;
    }

    public void setUsuarioIngreso(String usuarioIngreso) {
        this.usuarioIngreso = usuarioIngreso;
    }

    @Column(name = "Observacion")
    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Custodia custodia = (Custodia) o;

        if (id != custodia.id) return false;
        if (caseCrrIdCuaderno != custodia.caseCrrIdCuaderno) return false;
        if (nMovimiento != null ? !nMovimiento.equals(custodia.nMovimiento) : custodia.nMovimiento != null)
            return false;
        if (fechaIngreso != null ? !fechaIngreso.equals(custodia.fechaIngreso) : custodia.fechaIngreso != null)
            return false;
        if (horaIngreso != null ? !horaIngreso.equals(custodia.horaIngreso) : custodia.horaIngreso != null)
            return false;
        if (usuarioIngreso != null ? !usuarioIngreso.equals(custodia.usuarioIngreso) : custodia.usuarioIngreso != null)
            return false;
        if (observacion != null ? !observacion.equals(custodia.observacion) : custodia.observacion != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (nMovimiento != null ? nMovimiento.hashCode() : 0);
        result = 31 * result + (fechaIngreso != null ? fechaIngreso.hashCode() : 0);
        result = 31 * result + (horaIngreso != null ? horaIngreso.hashCode() : 0);
        result = 31 * result + (usuarioIngreso != null ? usuarioIngreso.hashCode() : 0);
        result = 31 * result + (observacion != null ? observacion.hashCode() : 0);
        return result;
    }
}
