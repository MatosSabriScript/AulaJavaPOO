package com.senai.Aula06_Abstracao.exemplo_interface.controle_equipamentos_inteligentes;

public class TvSmart implements AparelhosInteligentes{
    private int volume;


    public TvSmart(int volume) {
        this.volume = 0;
    }

    @Override
    public void ligar() {
        System.out.println("tv Smart ligada");

    }

    @Override
    public void desligar() {
        System.out.println("tv Smart deligada");
    }


    public  void aumentarVolume(){
        System.out.printf("Volume %d \n",volume=ajusteNivel(volume,1));
    }

    public void baixarVolume()
    {
        System.out.printf("Volume %d\n",volume=ajusteNivel(volume,-1));
    }
}

