package com.senai.Aula08_CleanCode;

public class PrimeiroPricipio {

        public void processar(int[] numeros) {
            int soma = calcularSoma(numeros);
            int maior = encontrarMaior(numeros);

            exibirResultados(soma,maior);
        }

        private int calcularSoma(int[] numeros) {
            int soma = 0;
            for (int n : numeros) {
                soma += n;
            }
            return soma;
        }

        private int encontrarMaior(int[] numeros) {
            int maior = Integer.MIN_VALUE;
            for (int n : numeros) {
                if (n > maior) {
                    maior = n;
                }
            }
            return maior;
        }

        private void exibirResultados(int soma, int maior) {
            System.out.println("Soma: " + soma);
            System.out.println("Maior número: " + maior);
        }
    }

