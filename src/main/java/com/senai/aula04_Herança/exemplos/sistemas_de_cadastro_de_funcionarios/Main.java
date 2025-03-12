package com.senai.aula04_Herança.exemplos.sistemas_de_cadastro_de_funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionarios f1= new Funcionarios("Pedro",2000.20);
        Gerente g1= new Gerente("Carlos",3500.69,25);

        f1.exibirDados();
        g1.exibirDados();
    }
}
