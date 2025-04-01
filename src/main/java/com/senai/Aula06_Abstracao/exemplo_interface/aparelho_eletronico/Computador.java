package com.senai.Aula06_Abstracao.exemplo_interface.aparelho_eletronico;

public class Computador implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("\nComputador ligado!");
    }

    public void desligar() {
        System.out.println("\nComputador desligado!");
    }
}