package com.senai.Aula05_PolImorfismo.exercicios.Sistema_MonitoramentoSensores;

public class SensorTemperatura extends Sensores{
    private String medida;

    public SensorTemperatura(double valorTemperatura, String medida) {
        super(valorTemperatura);
        this.medida = medida;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println(getValorTemperatura()+"\n"+getMedida());
    }
}
