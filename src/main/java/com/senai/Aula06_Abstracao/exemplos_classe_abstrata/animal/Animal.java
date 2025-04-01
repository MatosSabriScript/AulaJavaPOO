package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.animal;

public  abstract class Animal {
    protected String nome;


    public Animal(String nome){
        this.nome=nome;
    }

    void dormir(){
        System.out.println(nome+"está dormindo");
    }

    abstract void fazerSom();
}
