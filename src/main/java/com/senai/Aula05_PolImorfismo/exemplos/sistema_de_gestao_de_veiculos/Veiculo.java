package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Veiculo  {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    }

    public String getModelo(){
        return modelo;
    }
}
