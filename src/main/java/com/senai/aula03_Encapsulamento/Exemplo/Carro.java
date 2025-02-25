package com.senai.aula03_Encapsulamento.Exemplo;

public class Carro {
        //Atributo privado:só pode ser acessado dentro da propria classe
        public int velocidade;

        //Contrutor da classe
        public Carro () {
            velocidade=0;       //Incialmente o carro está parado
        }

         //Método publico para obter a velocidade (Getter)
        public int getVelocidade(){
            return velocidade;
        }


        //Método publico para definir a velocidade (Setter)
        public void setVelocidade (int velocidade){
            if (velocidade>=0){       //Regra de negócio: velocidade não podeser negativa
                this.velocidade=velocidade;
            }else {
                System.out.println("Velocidade inválida!");
            }
        }
    }

