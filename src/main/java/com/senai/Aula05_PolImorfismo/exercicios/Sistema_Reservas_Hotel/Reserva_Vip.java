package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Reserva_Vip extends Reserva {
    protected int acrescimoDia;

    // Constructor
    public Reserva_Vip(String nome, double valorDiaria, String dataReserva, int qtdDias, int acrescimoDia) {
        super(nome, valorDiaria, dataReserva, qtdDias);
        this.acrescimoDia = acrescimoDia;
    }

    // Getter for acrescimoDia
    public int getAcrescimoDia() {
        return acrescimoDia;
    }

    @Override
    public void calcularValorDiaria() {
        // The formula should be: (valorDiaria + acrescimoDia * qtdDias)
        double valorTotal = (getValorDiaria() + acrescimoDia) * getQtdDias();
        System.out.println("Valor total da reserva VIP: R$ " + valorTotal);
    }
}


