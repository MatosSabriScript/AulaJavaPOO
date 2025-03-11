package com.senai.aula04_Herança.exemplos.veiculo;

public class Moto extends Veiculo {
     private boolean partidaEletrica;

    public Moto(int ano, String modelo,Boolean partidaEletrica) {
        super(ano, modelo);
        this.partidaEletrica= PartidaEletrica();
    }

    public boolean PartidaEletrica() {
        return partidaEletrica;
    }

    public void setPartidaEletrica(boolean partidaEletrica) {
        this.partidaEletrica = partidaEletrica;
    }

    public void exibirdetalhes(){
        super.exibirDetalhes();
        System.out.println( ", Partida Eletrica"+ (partidaEletrica?"Sim":"Não"));
    }
}
