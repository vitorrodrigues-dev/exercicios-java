package review_fase5.ex3;

public class Main {
    public static void main(String[] args) {

        int opcao = 2;

        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 - Cadastrar");
                    break;
                case 2:
                    System.out.println("Opção 2 - Listar");
                    break;
                case 3:
                    System.out.println("Opção 3 - Excluir");
                    break;
                case 4:
                    System.out.println("Opção 4 - Sair");
                    break;
                default:
                    System.out.println("Erro - Digite uma opção válida");
                    break;
            }
            break;
        }
    }
}
