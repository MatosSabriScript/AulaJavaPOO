package com.senai.Aula06_Abstracao.exemplo_interface.matematica;

public class Main {
    public static void main(String[] args) {
        int resultadoSoma = Matematica.somar(5, 10);
        System.out.printf("\nO resultado da soma é: %s.\n", resultadoSoma);

        System.out.printf("\nO valor de PI é: %s.\n", Matematica.PI);
    }
}