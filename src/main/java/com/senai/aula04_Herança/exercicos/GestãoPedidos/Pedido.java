package com.senai.aula04_Herança.exercicos.GestãoPedidos;

public class Pedido {
    protected  String nomeProduto;
    protected double valor;

    public Pedido(String nomeProduto, double valor) {
        this.nomeProduto = nomeProduto;
        this.valor = valor;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void exibirDetalhes(){
        System.out.println("Nome do Produto: "+nomeProduto);
        System.out.println("Valor"+"R$ "+valor);
    }
}
