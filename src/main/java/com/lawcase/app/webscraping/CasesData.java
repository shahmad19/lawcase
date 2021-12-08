package com.lawcase.app.webscraping;

import com.lawcase.app.dtos.BaseDTO;
import lombok.Data;

import java.util.Date;

@Data
public class CasesData {
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipCausa() {
        return tipCausa;
    }

    public void setTipCausa(String tipCausa) {
        this.tipCausa = tipCausa;
    }

    public int getRolCausa() {
        return rolCausa;
    }

    public void setRolCausa(int rolCausa) {
        this.rolCausa = rolCausa;
    }

    public int getEraCausa() {
        return eraCausa;
    }

    public void setEraCausa(int eraCausa) {
        this.eraCausa = eraCausa;
    }

    public int getCrrIdCuaderno() {
        return crrIdCuaderno;
    }

    public void setCrrIdCuaderno(int crrIdCuaderno) {
        this.crrIdCuaderno = crrIdCuaderno;
    }

    public int getCrrIdCausa() {
        return crrIdCausa;
    }

    public void setCrrIdCausa(int crrIdCausa) {
        this.crrIdCausa = crrIdCausa;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCaratulado() {
        return caratulado;
    }

    public void setCaratulado(String caratulado) {
        this.caratulado = caratulado;
    }

    public int getTribunalId() {
        return tribunalId;
    }

    public void setTribunalId(int tribunalId) {
        this.tribunalId = tribunalId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEstAdm() {
        return estAdm;
    }

    public void setEstAdm(String estAdm) {
        this.estAdm = estAdm;
    }

    public String getProc() {
        return proc;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getEstadoProc() {
        return estadoProc;
    }

    public void setEstadoProc(String estadoProc) {
        this.estadoProc = estadoProc;
    }

    public String getTextoDemanda() {
        return textoDemanda;
    }

    public void setTextoDemanda(String textoDemanda) {
        this.textoDemanda = textoDemanda;
    }

    public int getFoja() {
        return foja;
    }

    public void setFoja(int foja) {
        this.foja = foja;
    }

    public int getIsPriv() {
        return isPriv;
    }

    public void setIsPriv(int isPriv) {
        this.isPriv = isPriv;
    }
}
