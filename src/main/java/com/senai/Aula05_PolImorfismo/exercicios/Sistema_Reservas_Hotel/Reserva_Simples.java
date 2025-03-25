package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Reserva_Simples extends Reserva {
    protected int taxaServico;

    // Constructor
    public Reserva_Simples(String nome, double valorDiaria, String dataReserva, int qtdDias, int taxaServico) {
        super(nome, valorDiaria, dataReserva, qtdDias);
        this.taxaServico = taxaServico;
    }

    // Getter for taxaServico
    public int getTaxaServico() {
        return taxaServico;
    }

    @Override
    public void calcularValorDiaria() {
        // Here we calculate the total value including the service fee.
        // The formula should be: (valorDiaria + taxaServico) * qtdDias
        double valorTotal = (getValorDiaria() + taxaServico) * getQtdDias();
        System.out.println("Valor total da reserva simples: R$ " + valorTotal);
    }
}


