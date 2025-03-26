package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Reserva_Vip extends Reserva {
    protected int acrescimoDia;


    public Reserva_Vip(String nome, double valorDiaria, String dataReserva, int qtdDias, int acrescimoDia) {
        super(nome, valorDiaria, dataReserva, qtdDias);
        this.acrescimoDia = acrescimoDia;
    }

    // acrescimoDia
    public int getAcrescimoDia() {
        return acrescimoDia+getQtdDias();
    }

    @Override
    public void calcularValorDiaria() {
        double valorTotal = (getValorDiaria() + acrescimoDia) * getQtdDias();
        System.out.println("Valor total da reserva VIP: R$ " + String.format("%.2f", valorTotal) +
                "\nO total de dias é: " + getAcrescimoDia());

    }
}


