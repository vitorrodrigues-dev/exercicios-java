package aula01;
import java.util.Scanner;

public class TesteDeMatéria {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String nome = "Vitor";
        System.out.println("Bem-vindo ao sistema do Vitor!");

        System.out.println("Digite sua idade: ");
        byte idade = leitor.nextByte();
        System.out.print("Qual o preço do produto a ser comprado?: ");
        float preco = leitor.nextFloat();

        System.out.println("Menu de pagamento");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão");
        System.out.println("3 - Fiado");

        System.out.println("Digite a forma de pagamento: (Opção 1, 2 ou 3)");
        int opcao = leitor.nextInt();

        boolean clienteVip = true;

        switch (opcao) {
            case 1:
                preco = preco * 0.9f;
                System.out.println("Pagamento em dinheiro! Valor final: R$ "+ preco);
                break;

            case 2:
                System.out.print("Pagamento em cartão! Valor final: R$ " + preco);
                break;

            case 3:
                if (idade >= 18 && clienteVip) {
                    System.out.println("Venda registrada no caderninho!");
                } else {
                    System.out.println("Venda fiada negada!");
                }
                break;

            default:
                System.out.println("Opção de pagamento inválida!");

                }

                leitor.close();

        }
}
