package com.lawcase.app.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "cases")
public class Cases {
    private Integer id;
    private String tipCausa;
    private int rolCausa;
    private int eraCausa;
    private int crrIdCuaderno;
    private int crrIdCausa;
    private Date createdAt;
    private String caratulado;
    private int tribunalId;
    private String url;
    private String estAdm;
    private String proc;
    private String location;
    private String etapa;
    private String estadoProc;
    private String textoDemanda;
    private int foja;
    private int isPriv;

    @Id @GeneratedValue
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name = "TIP_Causa")
    public String getTipCausa() {
        return tipCausa;
    }

    public void setTipCausa(String tipCausa) {
        this.tipCausa = tipCausa;
    }

    
    @Column(name = "ROL_Causa")
    public int getRolCausa() {
        return rolCausa;
    }

    public void setRolCausa(int rolCausa) {
        this.rolCausa = rolCausa;
    }

    
    @Column(name = "ERA_Causa")
    public int getEraCausa() {
        return eraCausa;
    }

    public void setEraCausa(int eraCausa) {
        this.eraCausa = eraCausa;
    }

    
    @Column(name = "CRR_IdCuaderno")
    public int getCrrIdCuaderno() {
        return crrIdCuaderno;
    }

    public void setCrrIdCuaderno(int crrIdCuaderno) {
        this.crrIdCuaderno = crrIdCuaderno;
    }

    
    @Column(name = "CRR_IdCausa")
    public int getCrrIdCausa() {
        return crrIdCausa;
    }

    public void setCrrIdCausa(int crrIdCausa) {
        this.crrIdCausa = crrIdCausa;
    }

    
    @Column(name = "created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
    @Column(name = "caratulado")
    public String getCaratulado() {
        return caratulado;
    }

    public void setCaratulado(String caratulado) {
        this.caratulado = caratulado;
    }

    
    @Column(name = "tribunal_id")
    public int getTribunalId() {
        return tribunalId;
    }

    public void setTribunalId(int tribunalId) {
        this.tribunalId = tribunalId;
    }

    
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name = "Est_Adm")
    public String getEstAdm() {
        return estAdm;
    }

    public void setEstAdm(String estAdm) {
        this.estAdm = estAdm;
    }

    
    @Column(name = "Proc")
    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    
    @Column(name = "Location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    
    @Column(name = "Etapa")
    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    
    @Column(name = "Estado_Proc")
    public String getEstadoProc() {
        return estadoProc;
    }

    public void setEstadoProc(String estadoProc) {
        this.estadoProc = estadoProc;
    }

    
    @Column(name = "Texto_Demanda")
    public String getTextoDemanda() {
        return textoDemanda;
    }

    public void setTextoDemanda(String textoDemanda) {
        this.textoDemanda = textoDemanda;
    }

    
    @Column(name = "Foja")
    public int getFoja() {
        return foja;
    }

    public void setFoja(int foja) {
        this.foja = foja;
    }

    
    @Column(name = "is_priv")
    public int getIsPriv() {
        return isPriv;
    }

    public void setIsPriv(int isPriv) {
        this.isPriv = isPriv;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cases cases = (Cases) o;

        if (id != cases.id) return false;
        if (rolCausa != cases.rolCausa) return false;
        if (eraCausa != cases.eraCausa) return false;
        if (crrIdCuaderno != cases.crrIdCuaderno) return false;
        if (crrIdCausa != cases.crrIdCausa) return false;
        if (tribunalId != cases.tribunalId) return false;
        if (foja != cases.foja) return false;
        if (isPriv != cases.isPriv) return false;
        if (tipCausa != null ? !tipCausa.equals(cases.tipCausa) : cases.tipCausa != null) return false;
        if (createdAt != null ? !createdAt.equals(cases.createdAt) : cases.createdAt != null) return false;
        if (caratulado != null ? !caratulado.equals(cases.caratulado) : cases.caratulado != null) return false;
        if (url != null ? !url.equals(cases.url) : cases.url != null) return false;
        if (estAdm != null ? !estAdm.equals(cases.estAdm) : cases.estAdm != null) return false;
        if (proc != null ? !proc.equals(cases.proc) : cases.proc != null) return false;
        if (location != null ? !location.equals(cases.location) : cases.location != null) return false;
        if (etapa != null ? !etapa.equals(cases.etapa) : cases.etapa != null) return false;
        if (estadoProc != null ? !estadoProc.equals(cases.estadoProc) : cases.estadoProc != null) return false;
        if (textoDemanda != null ? !textoDemanda.equals(cases.textoDemanda) : cases.textoDemanda != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tipCausa != null ? tipCausa.hashCode() : 0);
        result = 31 * result + rolCausa;
        result = 31 * result + eraCausa;
        result = 31 * result + crrIdCuaderno;
        result = 31 * result + crrIdCausa;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (caratulado != null ? caratulado.hashCode() : 0);
        result = 31 * result + tribunalId;
        result = 31 * result + (url != null ? url.hashCode() : 0);
        result = 31 * result + (estAdm != null ? estAdm.hashCode() : 0);
        result = 31 * result + (proc != null ? proc.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (etapa != null ? etapa.hashCode() : 0);
        result = 31 * result + (estadoProc != null ? estadoProc.hashCode() : 0);
        result = 31 * result + (textoDemanda != null ? textoDemanda.hashCode() : 0);
        result = 31 * result + foja;
        result = 31 * result + isPriv;
        return result;
    }
}
