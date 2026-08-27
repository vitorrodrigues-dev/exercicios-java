package aula11_cafeteria.model;

public class Caixa {

    public void registarVenda(Produto produto, int quantidade) throws QuantidadeInvalidaException{
         if (quantidade < 0) {
             throw new QuantidadeInvalidaException("A quantidade da venda deve ser maior que zero.");
         }
    }

    public double calcularTotal(Produto produto, int quantidade) {
        double total = produto.getPreco() * quantidade;
        return total;

    }

    public double calcularTroco(double total, double valorPago) {
       double troco = valorPago - total;
       return troco;
    }


 }
