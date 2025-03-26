package com.senai.Aula05_PolImorfismo.exercicios.Sistema_MonitoramentoSensores;

public class Main {
    public static void main(String[] args) {

        SensorTemperatura sensorTemperatura= new SensorTemperatura(25,"Celsisus");
        SensorUmidade sensorUmidade=new SensorUmidade(32,2);

        System.out.println("A medida de temperatura  é :");
        sensorTemperatura.exibirDetalhes();

        System.out.println("A medida de temperatura de umidade  é :");
        sensorUmidade.exibirDetalhes();


    }
}
