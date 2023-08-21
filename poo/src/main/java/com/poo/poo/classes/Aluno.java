package com.poo.poo.classes;

import java.util.Scanner;

public class Aluno {
    static int contador = 1000;
    private String nome;
    private String data_nasc;
    private int matricula;
    
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, String data_nasc){
        Scanner sc = new Scanner(System.in);
        this.setNome(nome);
        this.setData_nasc(data_nasc);
        this.setMatricula(contador);
        contador++;
        sc.close();
    }
}
