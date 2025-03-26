package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Reserva_Simples extends Reserva {
    protected double taxaServico;

    // Constructor
    public Reserva_Simples(String nome, double valorDiaria, String dataReserva, int qtdDias, double taxaServico) {
        super(nome, valorDiaria, dataReserva, qtdDias);
        this.taxaServico = taxaServico;
    }

    // Getter for taxaServico
    public double getTaxaServico() {
        return taxaServico*getQtdDias();
    }

    @Override
    public void calcularValorDiaria() {
        // Here we calculate the total value including the service fee.
        // The formula should be: (valorDiaria + taxaServico) * qtdDias
        double valorReserva = (getValorDiaria() * getQtdDias());
        double valorTotal = (getValorDiaria()+taxaServico) * getQtdDias();
        System.out.println("Valor total da reserva simples: R$ " + String.format("%.2f", valorReserva) +
                "\nValor total da reserva simples: R$ " + String.format("%.2f", valorTotal) +
                "\nO total de dias é: " + getQtdDias() +
                "\nA taxa de serviço será: R$ " + String.format("%.2f", getTaxaServico()));

    }
}


