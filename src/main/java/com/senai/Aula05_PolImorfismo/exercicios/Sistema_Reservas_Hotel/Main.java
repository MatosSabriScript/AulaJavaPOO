package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Main {
    public static void main(String[] args) {
        // Criando uma reserva simples
        Reserva_Simples reservaSimples = new Reserva_Simples("João Silva", 200.0, "25/03/2025", 5, 30);

        // Exibindo dados e calculando o valor total da reserva simples
        System.out.println("Reserva Simples:");
        reservaSimples.exibirdados();
        reservaSimples.calcularValorDiaria();

        // Criando uma reserva VIP
        Reserva_Vip reservaVip = new Reserva_Vip("Maria Oliveira", 300.0, "26/03/2025", 3, 50);

        // Exibindo dados e calculando o valor total da reserva VIP
        System.out.println("\nReserva VIP:");
        reservaVip.exibirdados();
        reservaVip.calcularValorDiaria();
    }
}
