package aula10_excessoes.exercicio04_sistemagerenciamento.view;
import java.util.Scanner;

import aula10_excessoes.exercicio04_sistemagerenciamento.model.EstoqueInsuficienteException;
import aula10_excessoes.exercicio04_sistemagerenciamento.model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto(123, "Produto teste", 12);
        Scanner leitor = new Scanner(System.in);


        int op = 0;
        do {
            System.out.println(" -- MENU --\n1 - Adicionar Produto\n2 - Remover Produto\n0 - Sair");
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Opção 1 escolhida");
                    System.out.println("Qual a quantidade a ser inserida? ");
                    int qtdAdicionar = leitor.nextInt();
                    produto.adicionarEstoque(qtdAdicionar);
                    System.out.println("Estoque atual: " + produto.getEstoque());
                    break;
                case 2:
                    System.out.println("Opção 2 escolhida");
                    System.out.println("Qual a quantidade a ser removida? ");
                    int qtdRemover = leitor.nextInt();
                    try  {
                         produto.removerEstoque(qtdRemover);
                        System.out.println("Estoque atual: " + produto.getEstoque());
                    } catch (EstoqueInsuficienteException e) {
                            System.out.println(e.getMessage());
                    }

                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, digite uma opção correta");


            }
        } while (op != 0);
        leitor.close();
    }
}


