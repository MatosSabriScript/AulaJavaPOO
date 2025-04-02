package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.gerenciador_funcionarios;

public class FuncionarioEfetivo extends Funcionario {
  private double bonusMensal;

    public FuncionarioEfetivo(String nome, double salario, double bonusMensal) {
        super(nome, salario);
        this.bonusMensal=bonusMensal;
    }

    @Override
     public double calcularBonus() {
       return  salario+= bonusMensal;

    }
}