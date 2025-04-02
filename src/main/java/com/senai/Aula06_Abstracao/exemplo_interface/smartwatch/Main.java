package com.senai.Aula06_Abstracao.exemplo_interface.smartwatch;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatchAvancado= new SmartWatchAvancado();

        smartWatchAvancado.exibirInfoDispositivos();
        smartWatchAvancado.medirFrequenciaCardiaca();
        smartWatchAvancado.contarPassos();
        smartWatchAvancado.medirQualidadeSono();
    }
}
