package aula08_heranca.sistemas_funcionarios.model;

public class Vendedor extends Funcionario {

    private int vendas;

    public Vendedor() {

    }

    public Vendedor(String nome, int cpf, double salario, int vendas) {
        super(nome, cpf, salario);
        this.vendas = vendas;
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() + (this.getSalario() * 0.05);
    }
}
