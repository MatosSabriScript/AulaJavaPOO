package com.senai.Aula05_PolImorfismo.exemplos.sistema_de_gestao_de_veiculos;

public class Caminhao extends Veiculo {
    public  Caminhao (String modelo){
        super(modelo);
    }

    @Override
    public void realizarManutencao() {
        System.out.println("Verificação dos freios realizada para o caminhão "+getModelo());
    }
}
