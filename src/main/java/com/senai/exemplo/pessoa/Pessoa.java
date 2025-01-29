package com.senai.exemplo.pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    String endereco;

    public Pessoa(String nome, int idade, float altura, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.endereco = endereco;
    }

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;

    }

    public void falar(String frase){
        System.out.println("A pessoa falou: " + frase);
    }

    public void comer(String alimento){
        System.out.println("A pessoa comeu: " + alimento);
    }

    @Override
    public String toString() {
        return "O nome da pessoa é "+this.nome+"tem "+this.idade+ "e tem de altura. "+this.altura+ "Seu endereço é "+ this.endereco;
    }
}
