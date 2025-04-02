package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.conta_bancaria;

public class Conta_Poupanca extends ContaBancaria{
    public Conta_Poupanca(String titutlar, double saldo) {
        super(titutlar, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo+=saldo*0.05;
    }
}
