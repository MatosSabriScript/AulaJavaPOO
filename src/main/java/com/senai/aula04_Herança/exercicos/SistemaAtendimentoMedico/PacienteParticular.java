package com.senai.aula04_Herança.exercicos.SistemaAtendimentoMedico;

public class PacienteParticular extends Paciente {
    protected double valorConsulta;

    public PacienteParticular(String nome, int idade, double valorConsulta ) {
        super(nome, idade);
        this.valorConsulta= valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Valor de consulta:"+"R$: "+valorConsulta);

    }
}
