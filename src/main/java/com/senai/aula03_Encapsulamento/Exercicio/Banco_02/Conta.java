package com.senai.aula03_Encapsulamento.Exercicio.Banco_02;

import java.util.Scanner;

//public class ContaBancaria {
//    String nome;
//    double saldo;
//    private double dinheiro;
//
//
//    public ContaBancaria(String nome, double saldo, double dinheiro) {
//        this.nome = nome;
//        this.saldo = 0.00;
//        this.dinheiro= dinheiro;
//    }
//
//    public void depositar(double saldo, double dinheiro){
//        System.out.println("Digite uma valor");
//        Scanner scanner= new Scanner(System.in);
//        double dinheiro = scanner.nextDouble();
//
//        double novoValor;
//        novoValor=saldo+dinheiro;
//
//        System.out.println("O valor depositado é:"+novoValor+"Seu saldo é "+ novoValor);
//    }
//}


  //if (valor > 0 && valor <= saldoConta) {
//            saldoConta -= valor;  // Subtrai o valor do saldo da conta de origem
//            contaDestino.depositar(valor);  // Adiciona o valor à conta destino
//            System.out.println("Transferência realizada com sucesso! Saldo atual: R$" + saldoConta);
//        } else {
//            System.out.println("Valor de transferência inválido ou saldo insuficiente!");
//        }

//-------------------------------------------- Explicacao do professor------------------------------------------------------------------------------------

public class Conta {
    private String titularConta;
    private double saldoConta;

    // Construtor
    public Conta(String titularConta, double saldoConta) {
        this.titularConta = titularConta;
        // Se o saldo for positivo, atribui o valor, caso contrário, define o saldo como 0
        if (saldoConta > 0) {
            this.saldoConta = saldoConta;
        } else {
            this.saldoConta = 0;
            System.out.println("O saldo não pode iniciar negativo! Será atribuído ao saldo o valor: R$0,0");
        }
    }

    // Getter e Setter para titularConta
    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    // Getter para saldoConta
    public double getSaldoConta() {
        return saldoConta;
    }

    // Metodo para sacar dinheiro
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldoConta) {
            saldoConta -= valor;  // Subtrai o valor do saldo
            mensagemSucesso("Sacar",this);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque!");
        }
        return false;
    }

    // Metodo para depositar dinheiro
    public boolean depositar(double valor) {
        if (valor > 0) {
            //saldoConta += valor;  // Adiciona o valor ao saldo
            //System.out.println("Depósito realizado com sucesso na conta!"+titularConta + "Saldo atual: R$" + saldoConta);
            mensagemSucesso("Depositar",this);
        } else {
            System.out.println("Valor de depósito inválido!"+"Deve ser um valor maior que R$0.00");
        } return false;
    }


    // Metodo para tranferir dinheiro
    public void transferir(double valor, Conta contaDestino) {
        if (this.sacar(valor)) {
            contaDestino.depositar(valor); //nesse caso vai depositar,pois não bloqueia o metodo
            System.out.println("O valor foi depositado com sucesso");
        }
    }

    public static void mensagemSucesso(String operacao,Conta minhaconta){
        System.out.println(operacao+ " realizado com sucesso! Saldo atual: R$ " + minhaconta.saldoConta);
        System.out.println(" na conta "+minhaconta.titularConta);
    }





    // Sobrescrevendo o metodo toString()
    @Override
    public String toString() {
        return "O titular " + this.titularConta + " possui o saldo de: R$" + this.saldoConta + " reais.";
    }
}
