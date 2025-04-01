package com.senai.Aula06_Abstracao.exemplo_interface.veiculo;

interface Veiculo {
    void acelerar();

    default void buzinar() {
        System.out.println("\nBuzinando: Beep beep!");
    }
}
