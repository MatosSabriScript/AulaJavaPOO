package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.gerenciador_funcionarios;

public class FuncionarioTemporario extends Funcionario {
    private  int horasExtras;
    private double valorHoraExtra;

    public FuncionarioTemporario(String nome, double salario,int horasExtras, double valorHoraExtra) {
        super(nome, salario);
        this.horasExtras=horasExtras;
        this.valorHoraExtra=valorHoraExtra;
    }

    @Override
    public double calcularBonus() {
       return salario+=horasExtras*valorHoraExtra;
    }
}
