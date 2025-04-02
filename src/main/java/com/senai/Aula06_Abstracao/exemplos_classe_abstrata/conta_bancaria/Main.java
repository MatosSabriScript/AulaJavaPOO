package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testarContas(new Conta_Corrente("Rafaela",1500));
        testarContas(new Conta_Poupanca("Pedro",20001.69));

    }
    public static void testarContas(ContaBancaria contaBancaria){
        contaBancaria.exibirSaldo();
        contaBancaria.aplicarTaxaMensal();
        contaBancaria.exibirSaldo();
    }
}
