package com.senai.Aula01_IntroducaoPOO.Exemplos.Pessoa;

public class Pessoa {
    String nome;
    int idade;
    float altura;
    Endereco endereco;

    public Pessoa(String nome, int idade, float altura, Endereco endereco) {
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
        System.out.println(nome+"A pessoa falou: " + frase);
    }

    public void comer(String alimento){
        System.out.println(nome+"A pessoa comeu: " + alimento);
    }

    @Override
    public String toString() {
        return "O nome da pessoa é " +this.nome+" tem "+this.idade+ "  tem de altura:  "+this.altura+ "." + "Seu endereço é:  "+ this.endereco;
    }
}
