package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.gerenciador_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected  double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario+=salario*porcentagem/100;
    }

    public abstract double calcularBonus();

    public void exibirDados(){
        System.out.println(nome+"recebe R$ " + salario);
    }
}
