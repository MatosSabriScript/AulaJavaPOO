package com.senai.aula03_Encapsulamento.Exemplo;

public class Main {
    public static void main(String[] args) {

        //Criando um objeto da classe carro
        Carro meuCarro= new Carro();


        //Utilizando métodos públicos para modificar e acessar a varável privada
        meuCarro.setVelocidade(100); //Define a velocidade para 100
        System.out.println("Velocidade atual: "+ meuCarro.getVelocidade());

        //Testando uma velocidade inválida
        //meuCarro.setVelocidade(-20); //Isso mostrará uma mensagem de erro
        meuCarro.velocidade =120; //Agora funciona sem erro
        System.out.println("Velocidade modificada diretamente: " +meuCarro.velocidade);

    }
}
