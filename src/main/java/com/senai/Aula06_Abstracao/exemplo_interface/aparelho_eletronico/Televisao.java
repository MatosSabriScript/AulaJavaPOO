package com.senai.Aula06_Abstracao.exemplo_interface.aparelho_eletronico;

public class Televisao implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("\nTV ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("\nTV desligada!");
    }

    public void mudarCanal() {
        System.out.println("\nMudei de canal!");
    }
}