package aula10_excessoes.view;

import aula10_excessoes.model.Pessoa;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "";

        try {
            System.out.print("Digite seu nome: ");
            nome = leitor.nextLine();
        } catch (Exception e) {
            System.out.println("Digite um nome válido, por favor.");
        }

        int idade = 0;

        try {
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Erro: Você precisa digitar um número válido!");
        }

        Pessoa pessoa = new Pessoa(nome, idade);

        System.out.println("-- DADOS --");
        pessoa.mostrarDados();

        leitor.close();
    }
}