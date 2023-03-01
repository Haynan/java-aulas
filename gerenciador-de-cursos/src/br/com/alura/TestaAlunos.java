package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Mauricio Aniche");

        boolean haynanEstaMatriculado = alunos.contains("Haynan Penha");
        alunos.remove("Sergio Lopes");

        System.out.println(haynanEstaMatriculado);

        /* for (String aluno : alunos) {
            System.out.println(aluno);
        } */

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

    }
}
