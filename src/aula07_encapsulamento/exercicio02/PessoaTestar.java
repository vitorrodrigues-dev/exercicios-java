package aula07_encapsulamento.exercicio02;

public class PessoaTestar {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Vitor";

        pessoa1.setIdade(18);

        System.out.println("A idade digitada foi: " + pessoa1.getIdade());
    }
}
