package com.lawcase.app.model;

import javax.persistence.*;

@Entity
@Table(name = "exhorto")
public class Exhorto {
    private Integer id;
    private int caseCrrIdCuaderno;
    private String rolOrigen;
    private String tipoExhorto;
    private String rolDestino;
    private String fecOrdenaExhorto;
    private String fecIngExhorto;
    private String tribunalDestino;
    private String estadoExhorto;

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

    
    @Column(name = "ROL_Origen")
    public String getRolOrigen() {
        return rolOrigen;
    }

    public void setRolOrigen(String rolOrigen) {
        this.rolOrigen = rolOrigen;
    }

    
    @Column(name = "Tipo_Exhorto")
    public String getTipoExhorto() {
        return tipoExhorto;
    }

    public void setTipoExhorto(String tipoExhorto) {
        this.tipoExhorto = tipoExhorto;
    }

    
    @Column(name = "ROL_Destino")
    public String getRolDestino() {
        return rolDestino;
    }

    public void setRolDestino(String rolDestino) {
        this.rolDestino = rolDestino;
    }

    
    @Column(name = "Fec_Ordena_Exhorto")
    public String getFecOrdenaExhorto() {
        return fecOrdenaExhorto;
    }

    public void setFecOrdenaExhorto(String fecOrdenaExhorto) {
        this.fecOrdenaExhorto = fecOrdenaExhorto;
    }

    
    @Column(name = "Fec_Ing_Exhorto")
    public String getFecIngExhorto() {
        return fecIngExhorto;
    }

    public void setFecIngExhorto(String fecIngExhorto) {
        this.fecIngExhorto = fecIngExhorto;
    }

    
    @Column(name = "Tribunal_Destino")
    public String getTribunalDestino() {
        return tribunalDestino;
    }

    public void setTribunalDestino(String tribunalDestino) {
        this.tribunalDestino = tribunalDestino;
    }

    
    @Column(name = "Estado_Exhorto")
    public String getEstadoExhorto() {
        return estadoExhorto;
    }

    public void setEstadoExhorto(String estadoExhorto) {
        this.estadoExhorto = estadoExhorto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exhorto exhorto = (Exhorto) o;

        if (id != exhorto.id) return false;
        if (caseCrrIdCuaderno != exhorto.caseCrrIdCuaderno) return false;
        if (rolOrigen != null ? !rolOrigen.equals(exhorto.rolOrigen) : exhorto.rolOrigen != null) return false;
        if (tipoExhorto != null ? !tipoExhorto.equals(exhorto.tipoExhorto) : exhorto.tipoExhorto != null) return false;
        if (rolDestino != null ? !rolDestino.equals(exhorto.rolDestino) : exhorto.rolDestino != null) return false;
        if (fecOrdenaExhorto != null ? !fecOrdenaExhorto.equals(exhorto.fecOrdenaExhorto) : exhorto.fecOrdenaExhorto != null)
            return false;
        if (fecIngExhorto != null ? !fecIngExhorto.equals(exhorto.fecIngExhorto) : exhorto.fecIngExhorto != null)
            return false;
        if (tribunalDestino != null ? !tribunalDestino.equals(exhorto.tribunalDestino) : exhorto.tribunalDestino != null)
            return false;
        if (estadoExhorto != null ? !estadoExhorto.equals(exhorto.estadoExhorto) : exhorto.estadoExhorto != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + caseCrrIdCuaderno;
        result = 31 * result + (rolOrigen != null ? rolOrigen.hashCode() : 0);
        result = 31 * result + (tipoExhorto != null ? tipoExhorto.hashCode() : 0);
        result = 31 * result + (rolDestino != null ? rolDestino.hashCode() : 0);
        result = 31 * result + (fecOrdenaExhorto != null ? fecOrdenaExhorto.hashCode() : 0);
        result = 31 * result + (fecIngExhorto != null ? fecIngExhorto.hashCode() : 0);
        result = 31 * result + (tribunalDestino != null ? tribunalDestino.hashCode() : 0);
        result = 31 * result + (estadoExhorto != null ? estadoExhorto.hashCode() : 0);
        return result;
    }
}
