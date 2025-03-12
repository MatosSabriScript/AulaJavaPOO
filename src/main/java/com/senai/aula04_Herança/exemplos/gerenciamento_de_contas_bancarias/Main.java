package com.senai.aula04_Herança.exemplos.gerenciamento_de_contas_bancarias;

public class Main {
    public static void main(String[] args) {
        Conta_Corrente contaCorrente=new Conta_Corrente("Mario",23000,12000);
        Conta_Poupanca contaPoupanca = new Conta_Poupanca("Pulos", 100,5);


        System.out.println("---------------");
        contaCorrente.sacar(120000);
        contaCorrente.sacar(10500);
        System.out.println("---------------");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();

        System.out.println("------teste de rendimento------");
        contaPoupanca.aplicarRendimento();

        System.out.println("----------");
        contaPoupanca.exibirSaldo();
        contaCorrente.exibirSaldo();
    }
}
