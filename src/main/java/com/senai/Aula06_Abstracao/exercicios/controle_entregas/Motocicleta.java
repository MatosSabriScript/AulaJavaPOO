package com.senai.Aula06_Abstracao.exercicios.controle_entregas;

public class Motocicleta extends Entrega_Veiculo {
    protected double velocidadeMaxima = 80;  // A velocidade máxima de uma motocicleta é geralmente mais alta do que a de uma bicicleta.

    public Motocicleta(double capacidadeCarga, double distancia) {
        super(capacidadeCarga, distancia);
    }

    @Override
    public void distanciaDestino() {
        // Calcular o tempo de deslocamento, considerando uma velocidade constante
        double tempo = distancia / velocidadeMaxima;
        System.out.println("Tempo de deslocamento da Motocicleta até o destino é de: " + tempo + " horas");
    }
}