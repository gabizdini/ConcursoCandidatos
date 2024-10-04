/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concursocandidatos;

import com.mycompany.concursocandidatos.entidade.Candidato;
import com.mycompany.concursocandidatos.entidade.LeitorCSV;
import java.util.Collections;
import java.util.List;

public class ConcursoCandidatos {

    public static void main(String[] args) {
        // Caminho do arquivo CSV
        String caminhoCSV = "C:\\Users\\15464073671\\Documents\\NetBeansProjects\\ConcursoCandidatos\\Arquivo\\dadosConcurso.csv";
        List<Candidato> candidatos = LeitorCSV.carregarCandidatos(caminhoCSV);
        Collections.sort(candidatos);
        for (Candidato c : candidatos) {
            System.out.println(c);
        }
    }
}
