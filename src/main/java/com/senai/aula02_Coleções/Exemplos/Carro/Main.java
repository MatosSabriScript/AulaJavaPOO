package com.senai.aula02_Coleções.Exemplos.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ArrayList<Carro> listarCarros = new ArrayList<>();

        System.out.println("Quantos carros dejesa inserir no sistema:");
        int qtdCarros= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preencha as informações a seguir:");


        for (int i = 0; i < qtdCarros; i++) {
            System.out.println("\ncarro: "+(i+1)+"\n");
            System.out.println("Modelo: ");
            String modelo=scanner.nextLine();
            System.out.println("fabricante: ");
            String fabricante=scanner.nextLine();
            System.out.println("cor : ");
            String cor=scanner.nextLine();
            System.out.println("ano: ");
            int ano=scanner.nextInt();
            scanner.nextLine();
            System.out.println("valor inicial: ");
            double valorInicial=scanner.nextDouble();
            scanner.nextLine();


            new Carro(modelo,fabricante,cor,ano,valorInicial);
            listarCarros.add(new Carro(modelo ,fabricante,cor,ano,valorInicial));

        }
        listarCarros.forEach(System.out::println);

    }
}
