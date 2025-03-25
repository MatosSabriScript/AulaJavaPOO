package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_pagamentos;

public class PJ extends Pagamento {
    private double horasTrabalhadas;
    private double valorPorHora;

    public PJ(String nome, double horasTrabalhadas, double valorPorHora) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas*valorPorHora;
    }
}

