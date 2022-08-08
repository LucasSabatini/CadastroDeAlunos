package com.lucassabatini.cadastroaluno;

import java.util.ArrayList;

public class Sala {

    ArrayList<Aluno> listaDeAlunos; // Lista para receber e armazenar todos os alunos

    //Construtor
    public Sala(){
        this.listaDeAlunos = new ArrayList<>(); //A cada sala nova, uma nova lista de alunos é criada
    }

    //Método para inserir um aluno na lista desta sala criada
    void insereAluno(Aluno novoAluno){
        novoAluno.calcularNota();
        listaDeAlunos.add(novoAluno);
    }

    //Método para listar todos os alunos desta sala
    void listarAlunos(){
        System.out.println("\n----------------------");
        System.out.println("   Lista de Alunos");
        System.out.println("----------------------");

        for (Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.listar();
        }
    }

    //Método para listar a situação de todos os alunos desta sala
    void listarSituacoes(){
        System.out.println("\n----------------------");
        System.out.println(" Situação dos Alunos");
        System.out.println("----------------------");

        for (Aluno alunoNaLista:listaDeAlunos){
            alunoNaLista.mostraSituacao();
        }
    }
}
