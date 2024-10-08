<h1 align="center">Projeto: Sistema de Classificação de Candidatos</h1>
<h2 align="center">Desenvolvido por: Gabrieli Diniz &hearts;</h2>
<h3 align="center">Disciplina Estrutura de Dados II</h3>


Este projeto é uma aplicação em Java que carrega dados de candidatos de um arquivo CSV, classifica-os com base nas notas de um concurso, e exibe a lista de candidatos ordenada. Em caso de empate nas notas, o critério de desempate utilizado é a idade (o candidato mais velho é classificado melhor).

<h3> Funcionalidades </h3>

* **Leitura de Arquivo CSV:** Carrega dados de candidatos, incluindo identificador, nome, data de nascimento e nota, a partir de um arquivo CSV.
* **Classificação de Candidatos:** Ordena os candidatos de acordo com suas notas, com desempate por idade (mais velho tem prioridade).
* **Exibição da Lista Ordenada:** Exibe a lista de candidatos ordenados na saída padrão.

<h3> Estrutura do Projeto </h3>

* **Candidato:** Representa os dados de um candidato e implementa a interface Comparable para permitir a comparação e ordenação dos objetos com base nas regras de classificação (nota e idade).
* **LeitorCSV:** Responsável pela leitura do arquivo CSV e criação de objetos da classe Candidato.
* **ConcursoCandidatos (Main):** Classe principal que gerencia a execução do programa, carregando os dados do CSV, classificando os candidatos e exibindo o resultado.
