package com.senai.aula04_Herança.exemplos.sistemas_de_cadastro_de_funcionarios;

public class Gerente extends  Funcionarios {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("\nNome: " + getNome() + ",Salário total R$" + (getSalario() + bonus));

    }
}


