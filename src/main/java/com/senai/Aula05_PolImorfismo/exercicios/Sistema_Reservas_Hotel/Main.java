package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Main {
    public static void main(String[] args) {

        // Criando uma reserva simples
        Reserva_Simples reservaSimples = new Reserva_Simples("João ", 200.00, "25/03/2025", 5, 30.23);

        // Exibindo dados e calculando o valor total da reserva simples
        System.out.println("========Reserva Simples:=============");
        reservaSimples.exibirdados();
        reservaSimples.calcularValorDiaria();

        // Criando uma reserva VIP
        Reserva_Vip reservaVip = new Reserva_Vip("Maria", 300.00, "26/03/2025", 3, 50);

        // Exibindo dados e calculando o valor total da reserva VIP
        System.out.println("\n==========Reserva VIP:==========|");

        reservaVip.exibirdados();
        reservaVip.calcularValorDiaria();
    }
}
