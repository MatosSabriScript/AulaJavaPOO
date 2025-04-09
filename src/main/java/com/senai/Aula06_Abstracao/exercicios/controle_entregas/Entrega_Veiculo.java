package com.senai.Aula06_Abstracao.exercicios.controle_entregas;

public abstract class Entrega_Veiculo {
    int velocidadeAtual;
    double capacidadeCarga;
    double distancia;

    // Construtor da classe abstrata
    public Entrega_Veiculo(double capacidadeCarga, double distancia) {
        this.velocidadeAtual = 0;
        this.capacidadeCarga = capacidadeCarga;
        this.distancia = distancia;
    }

    // Metodo para verificar a velocidade
    public void verificarVelocidade() {
        System.out.println("Velocidade atual do veículo: " + velocidadeAtual + " km/h");
    }

    public abstract void distanciaDestino();
}
