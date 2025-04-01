package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.veiculo;

public abstract class Main {
    public static void main(String[] args) {
        Carro carro= new Carro();
        carro.ligar();
        carro.acelerar(20);

        Moto moto= new Moto();
        moto.ligar();
        moto.acelerar(30);
    }
}
