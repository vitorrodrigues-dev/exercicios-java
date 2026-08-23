package aula09_polimorfismo.exercicio02.model;

public class Pagamento {

    public void pagar() {
        System.out.println("Pagamento realizado.");
    }

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor);
    }

    public void pagar(double valor, String formaPagamento) {
        System.out.println("Pagamento de R$ " + valor + " via " + formaPagamento);
    }
}
