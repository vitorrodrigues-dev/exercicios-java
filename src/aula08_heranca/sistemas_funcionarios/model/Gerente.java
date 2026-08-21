package aula08_heranca.sistemas_funcionarios.model;

public class Gerente extends Funcionario {


    private int sala;

    public Gerente(){

    }

    public Gerente(String nome, int cpf, double salario, int sala) {
        super(nome, cpf, salario);
        this.sala = sala;
    }


    @Override
    public double calcularBonus() {
        return this.getSalario() + (this.getSalario() * 0.10);
    }
}
