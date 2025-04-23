package com.senai.Aula07_mcv_crud_usuario.view;

import com.senai.Aula07_mcv_crud_usuario.controller.OperatorController;
import com.senai.Aula07_mcv_crud_usuario.controller.SupervisorController;
import com.senai.Aula07_mcv_crud_usuario.model.Operator;
import com.senai.Aula07_mcv_crud_usuario.model.Supervisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperatorController operatorController = new OperatorController();
        SupervisorController supervisorController = new SupervisorController();

        String menu = """
                
                        Menu 
                         1-Cadastar usuario
                         2- Deletar usuario
                         3- Atualizar usuario
                         4- Exibir usuarios  
                         5- Ligar máquina
                         6- Demitir o operador
                         7- Sair
                """;

        int opcao = 0;
        do {
            System.out.println(menu);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Qual tipo de usuario?");
                    System.out.println("1-Operador");
                    System.out.println("2- Supervisor");
                    int escolhaTipo = scanner.nextInt();
                    System.out.println("Preencha os dados a seguir");

                    int id= scanner.nextInt();
                    scanner.nextLine();
                    String nome= scanner.nextLine();

                    if (escolhaTipo == 1) {
                        String setor= scanner.nextLine();
                        Operator operator = new Operator(nome,id,setor);
                        opController.cadastrarOperador (operator);

                    } else if (escolhaTipo == 2) {
                        String area= scanner.nextLine();
                        Supervisor supervisor= new Supervisor(nome,id,area);
                        supController.cadastarSupervisor(supervisor);

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    opController.listarOperadores().forEach(System.out::println);
                    supController.listarSupervisores().forEach(System.out::println);

                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    System.out.println("Saindo do sistema....");
                    break;
                default:
                    System.out.println("opção invalida");


            }
        }

    }
}
