package com.senai.Aula05_PolImorfismo.exemplos.calculadora;

public class Main {
    public static void main (String[]args){
            Calculadora calculadora = new Calculadora();//Criando uma instancia;

            calculadora.somar(2, 3);//int, int
            calculadora.somar(2, 3, 4);//int, int. int
            calculadora.somar(3.5, 4.3);//double, double
            calculadora.somar(5, 6.9);//int, double
            calculadora.somar(6.9, 4);//double int
        }
    }


