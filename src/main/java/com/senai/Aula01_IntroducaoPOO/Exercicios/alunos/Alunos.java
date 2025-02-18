package com.senai.exercicios.alunos;

import java.util.Scanner;

public class Alunos {
    String nome;
    int idade;
    double nota;

    public Alunos(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public void exibirInformacoes() {
        System.out.println("O nome do aluno é: " + nome + ", ele tem " + idade + " anos e sua nota é: " + nota);
    }

    public void atualizarNota(double novaNota) {
        this.nota = novaNota;  // Atualiza a nota do aluno
        System.out.println("A nota do aluno " + nome + " é: " + novaNota);
    }

    public void verificarNota() {
        if (nota >= 6) {
            System.out.println("Esse aluno está aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }

    @Override
    public String toString() {
        String status = (nota >= 6) ? "Aprovado" : "Reprovado";
        return "Alunos{" +
                "nome='" + nome + "', idade=" + idade +
                ", nota=" + nota + ", status=" + status + "}";
    }
}
