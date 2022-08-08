package com.lucassabatini.cadastroaluno;

import java.util.ArrayList;

public class Aluno {

    String nome;
    String cpf;
    ArrayList<Float> notasAluno = new ArrayList<>(); //Lista para receber e armazenar as notas de cada aluno
    float total, media;
    String situacao = "Reprovado!";

    //Construtores
    public Aluno(){

    }

    public Aluno(String nome, String cpf){
        setNome(nome);
        setCpf(cpf);
    }

    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ArrayList<Float> getNotasAluno() {
        return notasAluno;
    }

    public void setNotasAluno(ArrayList<Float> notasAluno) {
        this.notasAluno = notasAluno;
    }

    //Método para inserir cada nota no ArrayList
    void insereNotas(float nota){
        notasAluno.add(nota);
    }

    //Método para listar cada aluno com seus respectivos dados
    void listar(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        for(int i = 0; i < notasAluno.size();i++){
            System.out.println("Nota " + (i + 1) + ": " + this.notasAluno.get(i));
        }
    }

    //Método para calcular a média final do aluno
    void calcularNota(){
        for(float notaDaLista:notasAluno){
            total += notaDaLista;
        }
        media = total/notasAluno.size();
        if (media < 4){
            this.situacao = "Reprovado!";
        }
        else if (media >= 4 && media < 6){
            this.situacao = "Recuperação!";
        }
        else {
            this.situacao = "Aprovado!";
        }
    }

    //Método para exibir o nome, a média e a situação de cada aluno
    void mostraSituacao(){
        System.out.println("\nNome: " + this.nome);
        System.out.println("Média: " + this.media);
        System.out.println("Situação: " + this.situacao);
    }
}
