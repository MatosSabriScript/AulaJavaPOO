package com.senai.Aula05_PolImorfismo.exemplos.animal;

public class Main {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Cachorro cachorro= new Cachorro();
        Gato gato=new Gato();

        animal.fazerSom();
        cachorro.fazerSom();
        gato.fazerSom();
    }
}
