package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.animal;

public class Gato extends Animal{

    public Gato(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + ": Miauuuuuu");
    }
}
