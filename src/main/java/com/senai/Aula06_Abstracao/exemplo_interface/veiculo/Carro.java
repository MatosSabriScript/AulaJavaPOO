package com.senai.Aula06_Abstracao.exemplo_interface.veiculo;

public class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("\nCarro acelerando!");
    }
}