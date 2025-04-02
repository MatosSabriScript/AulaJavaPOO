package com.senai.Aula06_Abstracao.exemplo_interface.controle_equipamentos_inteligentes;

public class LampadaInteligente implements  AparelhosInteligentes{
    private int brilho;


    public LampadaInteligente(int brilho) {
        this.brilho = 0;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {
    }


    public  void aumentarBrilho(){
        System.out.printf("Brilho %d\n",brilho=ajusteNivel(brilho,-1));
    }

    public void baixarBrilho()
    {
    }
}
