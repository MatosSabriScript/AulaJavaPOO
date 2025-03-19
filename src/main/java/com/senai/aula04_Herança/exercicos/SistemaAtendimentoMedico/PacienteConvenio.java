package com.senai.aula04_Herança.exercicos.SistemaAtendimentoMedico;

public class PacienteConvenio extends Paciente{
    protected double descontoCusto;


    public PacienteConvenio(String nome, int idade, double descontoCusto) {
        super(nome, idade);
        this.descontoCusto=descontoCusto;
    }

    public double getDescontoCusto() {
        return descontoCusto;
    }

    public void setDescontoCusto(double descontoCusto) {
        this.descontoCusto = descontoCusto;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Taxa de desconto: " +"R$: "+ descontoCusto);
    }
}
