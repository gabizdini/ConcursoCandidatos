/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concursocandidatos.entidade;

import java.time.LocalDate;
import java.time.Period;

public class Candidato implements Comparable<Candidato> {
    private String identificador;
    private String nome;
    private LocalDate dataNascimento;
    private double nota;

    public Candidato(String identificador, String nome, LocalDate dataNascimento, double nota) {
        this.identificador = identificador;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nota = nota;
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public double getNota() {
        return nota;
    }

    // Método para calcular a idade a partir da data de nascimento
    public int getIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public int compareTo(Candidato outro) {
        // Comparar notas
        if (this.nota > outro.nota) {
            return -1; // Primeiro critério: maior nota fica melhor classificada
        } else if (this.nota < outro.nota) {
            return 1;
        } else {
            // Em caso de empate, comparar pela idade (mais velho primeiro)
            return Integer.compare(outro.getIdade(), this.getIdade());
        }
    }

    @Override
    public String toString() {
        return "Candidato{" +
                "identificador= " + identificador +
                ", nome= " + nome +
                ", dataNascimento= " + dataNascimento +
                ", nota= " + nota +
                ", idade= " + getIdade() +
                '}';
    }
}
