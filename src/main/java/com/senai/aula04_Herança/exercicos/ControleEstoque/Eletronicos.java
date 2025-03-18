package com.senai.aula04_Herança.exercicos.ControleEstoque;

public class Eletronicos extends Produtos {
    protected float voltagem;

    public Eletronicos(String nome, double preco, double qtd, float voltagem) {
        super(nome, preco, qtd);
        this.voltagem = voltagem;
    }

    public float getVoltagen() {
        return voltagem;
    }

    public void setVoltagen(float voltagen) {
        this.voltagem = voltagen;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o metodo da classe Produto
        System.out.println("Voltagem: " + voltagem);
    }
}

