package aula11_cafeteria.view;
import aula11_cafeteria.model.Produto;
import aula11_cafeteria.model.QuantidadeInvalidaException;
import aula11_cafeteria.model.Caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto(123, "Café", 5.00, 32);
        Caixa caixa = new Caixa();
        Scanner leitor = new Scanner(System.in);

        int op = 0;
        while(op != -1) {
            System.out.println(" -- MENU --\n1 - Comprar café\n0 - Sair");
            op = leitor.nextInt();

            switch (op) {
                case 1:

                    try {
                    //    produto1.mostrarDados();
                        System.out.println("Qual a quantidade desejada?");
                        int quantidade = leitor.nextInt();
                        caixa.registarVenda(produto1, quantidade);

                        


                    } catch (QuantidadeInvalidaException e) {
                        System.out.println(e.getMessage());
                    }


                break;
                case 0:
                    System.out.println("Encerrando...");
                break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        leitor.close();



    }
}
