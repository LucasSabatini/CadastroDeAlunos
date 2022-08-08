package com.lucassabatini.cadastroaluno;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opc; //Opção para o menu
        int qtdNotas; //Quantidade de notas do aluno para inserir
        float nota; //nota do aluno
        String nome; // Nome do aluno
        String cpf; //Cpf do aluno

        Scanner teclado = new Scanner(System.in); //Construção da entrada do teclado
        Aluno novoAluno; //Construção do objeto novoAluno do tipo(classe) Aluno
        Sala novaSala = new Sala(); // Construção do objeto novaSala

        do {
            //Menu do usuário
            System.out.println("\n----------------------");
            System.out.println("        MENU");
            System.out.println("----------------------");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Situação dos alunos");
            System.out.println("0 - Sair");

            opc = teclado.nextInt(); //Ler a opção do usuário
            teclado.nextLine(); //Limpar o buffer do teclado

            switch (opc) {
                case 1 -> {
                    System.out.printf("\nInforme o nome do aluno: ");
                    nome = teclado.nextLine();
                    System.out.printf("Informe o CPF do aluno: ");
                    cpf = teclado.nextLine();

                    novoAluno = new Aluno(nome, cpf);

                    System.out.printf("Quantas notas você deseja adicionar para o aluno?: ");
                    qtdNotas = teclado.nextInt();

                    for (int i = 0; i < qtdNotas; i++) {
                        System.out.printf("Nota " + (i + 1) + ": ");
                        nota = teclado.nextFloat();
                        novoAluno.insereNotas(nota);
                    }

                    novaSala.insereAluno(novoAluno);
                }
                case 2 -> {
                    novaSala.listarAlunos();
                }
                case 3 -> {
                    novaSala.listarSituacoes();
                }

                case 0 -> {
                    System.out.println("\nSaindo...");
                }
                default -> {
                    System.out.println("\nOpção inválida!");
                }
            }

        } while (opc != 0);
    }
}
