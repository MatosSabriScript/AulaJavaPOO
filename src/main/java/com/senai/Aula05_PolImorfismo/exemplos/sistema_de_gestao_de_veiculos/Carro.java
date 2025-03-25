package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Carro extends Veiculo {
    public Carro (String modelo){
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("manutenção preventiva realizada para o carro "+getModelo());
    }
}
