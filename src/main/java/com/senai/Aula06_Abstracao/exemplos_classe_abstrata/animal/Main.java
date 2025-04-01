package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal>listaDeAnimal=new ArrayList<>();

        listaDeAnimal.add(new Cachorro("Gel"));
        listaDeAnimal.add(new Gato("Mel"));

        listaDeAnimal.forEach(animal ->{
            animal.dormir();
            animal.fazerSom();

        });
        }
    }

