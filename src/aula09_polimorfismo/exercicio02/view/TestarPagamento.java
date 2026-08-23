package aula09_polimorfismo.exercicio02.view;
import aula09_polimorfismo.exercicio02.model.Pagamento;

public class TestarPagamento {
    public static void main(String[] args) {

        Pagamento p1 = new Pagamento();

        p1.pagar();

        p1.pagar(200);

        p1.pagar(200, "Pix");

    }
}
