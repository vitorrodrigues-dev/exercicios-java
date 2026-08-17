package aula07_encapsulamento.exercicio03;

public class Conta {

    private String titular;
    private double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor inválido");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
