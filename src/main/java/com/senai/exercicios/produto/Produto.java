package com.senai.exercicios.produto;

import java.util.Scanner;

public class Produto {
    String nome;
    double valor;
    int qtd;

    public Produto(String nome, double valor, int qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;




    }

    public void exibirDetalhes(){
        System.out.println("O produto é: "+this.nome+ ","+ "o valor é:"+this.valor+ " e a quantidade é: "+ this.qtd);
    }

    public void  calcularValor (int valores){
        double total= (qtd*valor);
        System.out.println(total);
    }

    public void atualizarProduto (int novoValor){
        double total= (qtd*valor);
        double totalizando=novoValor;
        totalizando= qtd*novoValor;
        System.out.println("O produto antes custava "+total+"\n agora custa"+ totalizando);
    }



}
