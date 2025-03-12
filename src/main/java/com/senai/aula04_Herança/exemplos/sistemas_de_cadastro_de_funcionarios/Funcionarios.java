package com.senai.aula04_Herança.exemplos.sistemas_de_cadastro_de_funcionarios;

public class Funcionarios {
    private String nome;
    protected double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionarios(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }

    public void exibirDados(){
        System.out.printf("Nome: %s, Salario, R$%,.2f\n",nome,salario);
    }
}
