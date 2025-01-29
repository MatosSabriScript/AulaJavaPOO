package com.senai.exemplo.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1= new Pessoa("Nicoly", 20);
        Pessoa pessoa2= new Pessoa(
                "Sabrina",
                21,
                1.8f,
                new Endereco(
                        "Rua Paulo",
                        7,
                        "jardim Colorado",
                        "SP",
                        "Sao paulo"
                ));



        System.out.println(pessoa1);
        System.out.println(pessoa2);

        pessoa1.comer("cenoura");
        pessoa2.comer("pizza");
    }
}
