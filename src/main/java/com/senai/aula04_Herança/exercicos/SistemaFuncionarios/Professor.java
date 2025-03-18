package com.senai.aula04_Herança.exercicos.SistemaFuncionarios;

public class Professor extends Funcionarios{
    protected String nomeDisciplina;

    public Professor(String nome, double salario,String nomeDisciplina) {
        super(nome, salario);
        this.nomeDisciplina= nomeDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Nome da disciplina "+ nomeDisciplina);
    }

    }

