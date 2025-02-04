package com.senai.exemplo.concessiornaria;



public class Main {
    public static void main(String[] args) {
        Carro carro1=  new Carro("Gol bolinha","Volgwarger","Preto",2011,144.98);
        Carro carro2=  new Carro
                ("Gol",
                        "Volgwarger",
                        "Preto",
                        2014,
                        14748.98);


        System.out.println(carro1);
        System.out.println(carro2);

        carro1.comprarCarro("Pedro");
        carro1.testeDriver();
        carro1.valorTabelaFipe(2025);


    }
}