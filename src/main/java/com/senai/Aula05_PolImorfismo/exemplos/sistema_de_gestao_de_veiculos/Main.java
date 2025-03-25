package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Main {
    public static void main(String[] args) {
        realizarManutencao(new Carro("City"));
        realizarManutencao(new Moto("Honda"));
        realizarManutencao(new Caminhao("Scania"));

    }

    private static void realizarManutencao(Veiculo veiculo){
        veiculo.realizarManutencao();
    }
}
