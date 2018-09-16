package com.company.composite;

public abstract class montaProjetos implements monta{

    public String nomeChip;

    @Override
    public void montaProjetosAgora() { System.out.println("Nome: "+getnomeChip()); }

    public String getnomeChip(){ return nomeChip; }

    public void setnomeChip(){ this.nomeChip = nomeChip;}
}
