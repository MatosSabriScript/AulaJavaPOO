package com.senai.Aula01_IntroducaoPOO.Exemplos.Pessoa;

public class Endereco {
    String rua;
    int numero;
    String bairro;
    String cidade;
    String  estado;

    public Endereco(String rua, int numero, String bairro, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return rua+ ","+numero+","+bairro+","+cidade + "e " +estado;
    }
}
