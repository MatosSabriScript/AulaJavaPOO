package com.senai.aula03_Encapsulamento.Exercicio.Banco_02;

public class Main {
    public static void main(String[] args) {
        Conta conta1= new Conta("Pedrinho",100);
        Conta conta2= new Conta("Fernanda",1000);


        System.out.println("----------teste sacar");
        conta1.sacar(-10);
        conta2.sacar(110);
        conta1.sacar(10);


        System.out.println("----------teste transferir");
        conta1.depositar(-200);
        conta2.depositar(200);

        System.out.println("----------teste transferir");
        conta1.transferir(100,conta1);


    }


}


