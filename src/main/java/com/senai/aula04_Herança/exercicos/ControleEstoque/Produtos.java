package com.senai.aula04_Herança.exercicos.ControleEstoque;

public class Produtos {
    protected String nome;
    protected double preco;
    protected double qtd;

    public Produtos(String nome, double preco, double qtd) {
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getQtd() {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + qtd);
    }
}
