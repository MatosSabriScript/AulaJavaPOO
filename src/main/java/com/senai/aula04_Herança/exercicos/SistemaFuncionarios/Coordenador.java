package com.senai.aula04_Herança.exercicos.SistemaFuncionarios;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Coordenador extends Funcionarios {
    private ArrayList<Professor> equipeProfessores;

    public Coordenador(String nome, double salario) {
        super(nome, salario);
        this.equipeProfessores = new ArrayList<>(); // Criando a lista dentro do construtor
    }


    public void addProfessor(Professor professor){
        equipeProfessores.add(professor);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Equipe de Professores:");
        for (Professor professor : equipeProfessores) {
            System.out.println("- " + professor.getNome() + " (Disciplina: " + professor.getNomeDisciplina()+ ")");
        }
    }
}

