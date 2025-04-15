package com.senai.Aula06_Abstracao.exercicios_abstracao.controle_entregas;


    public class Main {
        public static void main(String[] args) {
            // Criando instâncias de Bicicleta e Motocicleta
            Bicicleta bicicleta = new Bicicleta(10.0, 50.0);
            Motocicleta motocicleta = new Motocicleta(20.0, 50.0);

            // Definindo a velocidade atual para a bicicleta e motocicleta (para testar o metodo de verificação de velocidade)
            bicicleta.velocidadeAtual = 115; // Definindo a velocidade para 15 km/h
            motocicleta.velocidadeAtual = 60; // Definindo a velocidade para 60 km/h




            // Imprimindo a velocidade atual
            System.out.println("---- Testando Bicicleta ----");
            bicicleta.verificarVelocidade(); // Mostra a velocidade da bicicleta
            bicicleta.distanciaDestino(); // Mostra o tempo até o destino da bicicleta

            System.out.println("---- Testando Motocicleta ----");
            motocicleta.verificarVelocidade(); // Mostra a velocidade da motocicleta
            motocicleta.distanciaDestino(); // Mostra o tempo até o destino da motocicleta
        }
    }


