package com.company.composite;

public class chip extends montaProjetos{

    public String tipoChip;

    public chip(String tipoChip, String nome) {
        super(nomeChip);
        this.tipoChip = tipoChip;
    }

    public String getTipoChip(){ return tipoChip; }

    public void setTipoChip(){ this.tipoChip = tipoChip; }
}
