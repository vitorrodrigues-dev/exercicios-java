package aula12_arrays_matrizes_vetores.praticandovetores.exercicio01;

import java.util.Scanner;

public class GerenciadorNotas {
    public static void main(String[] args) {

        // Notas do aluno, cada elemento representa uma disciplina
        double[] notasAluno = new double[5];

        Scanner sc = new Scanner(System.in);
        for(int i=0; i < notasAluno.length; i++) {
            System.out.println("Digite a nota: " + (i+1));
            notasAluno[i] = sc.nextDouble();
        }

        // Calculando a média das notas
        double somaNotas = 0;
        for (int i = 0; i < notasAluno.length ; i++){
            somaNotas += notasAluno[i];
        }
        double media = somaNotas / notasAluno.length;

        // Imprimindo a média e determinando a situação do aluno
        System.out.println("Média do aluno: " + media);
        if(media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}



