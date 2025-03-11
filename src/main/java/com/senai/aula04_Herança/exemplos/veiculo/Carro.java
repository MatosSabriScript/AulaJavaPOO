package com.senai.aula04_Herança.exemplos.veiculo;

public class Carro extends Veiculo {
    private int portas;

    public Carro(int ano, String modelo, int portas) {
        super(ano, modelo);
        this.portas=portas;

    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(", Portas:"+portas);
    }
}
