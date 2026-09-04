package review_fase5.ex1;

public class Main {
    public static void main(String[] args) {

        int idade;
        idade = 18;

        if (idade >= 18) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }


        switch (idade) {
            case 1:
                System.out.println("Prossiga");
                break;
            case 2:
                System.out.println("Opa");
                break;
            default:
                System.out.println("Erro");
        }


        double notaAluno;
        notaAluno = 3;

        if (notaAluno >= 7) {
            System.out.println("Aproved");
        } else if (notaAluno >= 5) {
            System.out.println("Neged");
        } else {
            System.out.println("Chore");
        }
    }
}
