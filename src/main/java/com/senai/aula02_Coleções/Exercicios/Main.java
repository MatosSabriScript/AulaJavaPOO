package com.senai.aula02_Coleções.Exercicios;

import com.senai.aula02_Coleções.Exemplos.Carro.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção");
        System.out.println("\t1- Adicionar tarefa");
        System.out.println("\t2- Listar Tarefa");
        System.out.println("\t3- Marcar tarefa como Concluida");
        System.out.println("\t4- Remover tarefa");
        System.out.println("\t5- Sair");

        opcao= scanner.nextInt();


        do {
            System.out.println(opcao);
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa();
                    break;
                case 2:
                    listarTarefa();
                    break;
                case 3:
                    marcarTarefa();
                    break;
                case 4:
                  removeTarefa();
                    break;
                case 5:
                    System.out.println("Fim de programa!!");
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        } while (opcao != 5);

    }
    public  static void adicionarTarefa(){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Carro> listarAtividade = new ArrayList<>();

        System.out.println("Quantos atividades desjea cadastrar:");
        int qtdAtividades= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Preencha as informações a seguir:");


        for (int i = 0; i < qtdAtividades; i++) {
            System.out.println("\nAtividade: "+(i+1)+"\n");
            System.out.println("Atividade: ");
            String atividade =scanner.nextLine();
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


            new Carro(atividade,fabricante,cor,ano,valorInicial);
            listarCarros.add(new Carro(atividade,fabricante,cor,ano,valorInicial));

        }
        listarCarros.forEach(System.out::println);

    }


    }

    public static void listarTarefa(){

    }

    public static void marcarTarefa(){

    }

    public static void removeTarefa(){

    }
}
