package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_pagamentos;

public class Pagamento {
    public String nome;

    public Pagamento (String nome){
        this.nome=nome;
    }

    public double calcularPagamento(){
        return 0.0;
    }
    public String getNome(){
        return nome;
    }
}
