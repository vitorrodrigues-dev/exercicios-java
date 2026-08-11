package aula02;

public class Aluno {

    String nome;
    int idade;
    double peso;

    void alterarPeso(double novoPeso) {
        peso = novoPeso;
    }

    void mostrarInfo( ) {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}




