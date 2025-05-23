package com.senai.Aula01_IntroducaoPOO.Exemplos.Concessiornaria;

public class Carro {
    String modelo;
    String fabricante;
    String cor;
    int ano;
    double valorinicial;



    public Carro(String modelo, String fabricante, String cor, int ano, double valorinicial) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cor = cor;
        this.ano = ano;
        this.valorinicial = valorinicial;
    }

    public void testeDriver(){
        System.out.println("Eba ligou");
    }

    public void comprarCarro(String nomeCliente){
        System.out.println("Parabéns"+nomeCliente+","+"você adquiriu o"+modelo);
    }

    public void valorTabelaFipe(int anoAtual){
        double valorFinal=valorinicial;
        int idade=anoAtual-ano;
        for (int i = 0; i < idade; i++) {
            valorFinal-=(valorFinal*0.02);

        }
        System.out.println("O valor atual do veiculo"+modelo+"com desvalorização de 2% ao ano será de R$"+String.format("%.2f",valorFinal));
    }

    @Override
    public String toString() {
        return "O carro é"+this.modelo+this.fabricante+this.cor+this.ano+valorinicial;
    }
}
