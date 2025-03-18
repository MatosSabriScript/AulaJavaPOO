package com.senai.aula04_Herança.exercicos.ControleEstoque;

import java.time.LocalDate;

// Classe principal para testar
public class Main {
    public static void main(String[] args) {

        // Criando um alimento dentro da validade
        Alimentos leite = new Alimentos("Leite", 5.99, 20, "30/12/2025");

        // Criando um alimento vencido
        Alimentos pao = new Alimentos("Pão", 2.50, 10, "15/03/2024");

        // Exibir detalhes
        System.out.println("=== Detalhes do Alimento ===");
        leite.exibirDetalhes(); // Deve aparecer como válido

        System.out.println("\n=== Detalhes do Alimento ===");
        pao.exibirDetalhes(); // Deve aparecer como vencido

        // Criando um objeto Eletronico
        Eletronicos tv = new Eletronicos("TV 42 Polegadas", 2500.00, 5, 110.f);
        System.out.println("\n=== Detalhes do Eletronico ===");
        tv.exibirDetalhes();

    }


    }

