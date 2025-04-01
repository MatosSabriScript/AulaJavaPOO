package com.senai.Aula06_Abstracao.exemplos_classe_abstrata.veiculo;

public abstract class Veiculo {
    int velocidade;

    Veiculo(){
    this.velocidade=0;
    }
    void acelerar (int incremento){
        velocidade+=incremento;
        System.out.println("Acelerando para "+velocidade+"Km/h");
    }

    //Metodo abstrado
    abstract void ligar();
}
