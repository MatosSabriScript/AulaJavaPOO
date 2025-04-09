package com.senai.Aula06_Abstracao.exercicios.controle_entregas;

public class Bicicleta extends Entrega_Veiculo {
    protected double velocidadeMaxima = 69;  // A velocidade máxima de uma bicicleta é bem mais baixa do que 100 km/h.

    public Bicicleta(double capacidadeCarga, double distancia) {
        super(capacidadeCarga, distancia);
    }

    @Override
    public void distanciaDestino() {
        double tempo = distancia / velocidadeMaxima;
        System.out.println("Tempo até o destino da Bicicleta é de: " + tempo + " horas");
    }
}
