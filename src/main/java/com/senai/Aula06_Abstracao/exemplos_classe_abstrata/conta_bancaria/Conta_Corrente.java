package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.conta_bancaria;

public class Conta_Corrente extends ContaBancaria{
    public Conta_Corrente(String titutlar, double saldo) {
        super(titutlar, saldo);
    }

    @Override
    void aplicarTaxaMensal() {
        saldo-=20;

    }
}
