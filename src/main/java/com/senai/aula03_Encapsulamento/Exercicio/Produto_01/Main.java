package com.senai.aula03_Encapsulamento.Exercicio.Produto_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o preço:");
        double preco = scanner.nextDouble();

        // Criando o objeto com valores informados pelo usuário
        Produto produtoNovo = new Produto();
        produtoNovo.setNome(nome);
        produtoNovo.setPreco(preco);

        // Exibindo os dados do produto
        System.out.println("Produto cadastrado: " + produtoNovo);

        scanner.close();
    }
}
