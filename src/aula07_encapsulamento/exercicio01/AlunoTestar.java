package aula07_encapsulamento.exercicio01;

public class AlunoTestar {
   public static void main(String[] args) {

       Aluno aluno1 = new Aluno();

       aluno1.setNome("Vitor");

       System.out.println(aluno1.getNome());

       aluno1.setIdade(50);
    }
}
