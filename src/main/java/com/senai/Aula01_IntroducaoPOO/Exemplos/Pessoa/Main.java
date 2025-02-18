package com.senai.Aula01_IntroducaoPOO.Exemplos.Pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa("Guilherme ", 20);
        Scanner scanner = new Scanner(System.in);
        String cabecalho[] = {"nome: ", "idade: ", "Altura: ", "Endereço:\n\trua: ",
                "\tnumero: ", "\tbairro: ", "\tcidade: ", "\testado: "};

        String [] dados = new String[8];

        System.out.println("Preencha os dados a seguir: ");
        for (int i = 0; i < cabecalho.length; i++) {
            System.out.println(cabecalho[i]);
            dados[i] = scanner.nextLine();

        }
        Pessoa pessoa2 = new Pessoa(
                dados [0],
                Integer.parseInt(dados[1]),
                Float.parseFloat(dados[2]),
                new Endereco(
                        dados[3],
                        Integer.parseInt(dados[4]),
                        dados[5],
                        dados[6],
                        dados[7] )
        );

        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("pizza");
        pessoa2.comer("salada");
    }

}
