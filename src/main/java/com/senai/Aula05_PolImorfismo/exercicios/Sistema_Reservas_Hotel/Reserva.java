package com.senai.Aula05_PolImorfismo.exercicios.Sistema_Reservas_Hotel;

public class Reserva {
    private String nome;
    private double valorDiaria;
    private String dataReserva;
    private  int qtdDias;


    public Reserva(String nome, double valorDiaria, String dataReserva, int qtdDias) {
        this.nome = nome;
        this.valorDiaria = valorDiaria;
        this.dataReserva = dataReserva;
        this.qtdDias = qtdDias;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public static void exibirdados(){
        System.out.println("\nEssa reserva é: ");
    }

    public void calcularValorDiaria(){

    }
}
