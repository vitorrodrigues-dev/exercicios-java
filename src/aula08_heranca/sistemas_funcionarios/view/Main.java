package aula08_heranca.sistemas_funcionarios.view;

import aula08_heranca.sistemas_funcionarios.model.Gerente;
import aula08_heranca.sistemas_funcionarios.model.Vendedor;

public class Main {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Vitor");
        gerente.setCpf(1282343443);
        gerente.setSalario(2000);

        System.out.println("Nome do Gerente: " + gerente.getNome() + "\n" + "CPF: " + gerente.getCpf() + "\n" + "Salário atual: " + gerente.calcularBonus());


        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Maria");
        vendedor.setCpf(234543134);
        vendedor.setSalario(1500);

        System.out.println("Nome do Vendedor: " + vendedor.getNome() + "\n" + "CPF: " + vendedor.getCpf() + "\n" + "Salário atual: " + vendedor.calcularBonus());


    }
}
