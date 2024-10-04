/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concursocandidatos.entidade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LeitorCSV {

    public static List<Candidato> carregarCandidatos(String caminhoArquivo) {
        List<Candidato> candidatos = new ArrayList<>();
        String linha;
        String separador = ","; // O CSV parece usar tabulação (\t) como separador
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            boolean primeiraLinha = true;
            while ((linha = br.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false; // Ignora o cabeçalho
                    continue;
                }

                String[] dados = linha.split(separador);
                String identificador = dados[0];
                String nome = dados[1];
                LocalDate dataNascimento = LocalDate.parse(dados[2], formatter);
                double nota = Double.parseDouble(dados[3]);

                Candidato candidato = new Candidato(identificador, nome, dataNascimento, nota);
                candidatos.add(candidato);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidatos;
    }
}

