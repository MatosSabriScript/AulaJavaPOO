package com.senai.Aula05_PolImorfismo.exercicios.Sistema_MonitoramentoSensores;

public class SensorUmidade extends Sensores{
    private int diferenca;

    public SensorUmidade(double valorTemperatura, int diferenca) {
        super(valorTemperatura);
        this.diferenca = diferenca;
    }

    public int getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(int diferenca) {
        this.diferenca = diferenca;
    }

    public void getDesconto(){
        double diferenca;
        diferenca=(getValorTemperatura()-getDiferenca());
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O sensor de umidade tem uma temperatura de "+getValorTemperatura()+ "É tem um desconto de "+getDiferenca());
    }
}
