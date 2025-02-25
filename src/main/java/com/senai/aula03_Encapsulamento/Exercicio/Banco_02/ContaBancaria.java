package com.senai.aula03_Encapsulamento.Exercicio.Banco_02;

import java.util.Scanner;

public class ContaBancaria {
    String nome;
    double saldo;
    private double dinheiro;


    public ContaBancaria(String nome, double saldo, double dinheiro) {
        this.nome = nome;
        this.saldo = 0.00;
        this.dinheiro= dinheiro;
    }

    public void depositar(double saldo, double dinheiro){
        System.out.println("Digite uma valor");
        Scanner scanner= new Scanner(System.in);
        double dinheiro = scanner.nextDouble();

        double novoValor;
        novoValor=saldo+dinheiro;

        System.out.println("O valor depositado é:"+novoValor+"Seu saldo é "+ novoValor);
    }
}
