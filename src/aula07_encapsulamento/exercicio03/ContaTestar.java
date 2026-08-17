package aula07_encapsulamento.exercicio03;

public class ContaTestar {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        conta1.setTitular("Vitor");

        conta1.depositar(100);

        conta1.depositar(-50);


        System.out.println(conta1.getSaldo());

    }
}
