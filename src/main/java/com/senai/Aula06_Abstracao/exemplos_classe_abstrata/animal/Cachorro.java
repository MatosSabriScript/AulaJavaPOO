package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.animal;

public  class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    void fazerSom() {
        System.out.println(nome + ": Auuuuuuuuu");
    }
}
