package aula02;

public class Main {

        public static void main( String[] args) {
            Aluno aluno1 = new Aluno();
            aluno1.nome = "Vitor";
            aluno1.idade = 18;
            aluno1.peso = 75.80;

            Aluno aluno2 = new Aluno();
            aluno2.nome = "João";
            aluno2.idade = 28;
            aluno2.peso = 89.87;

            aluno1.mostrarInfo();
            aluno2.mostrarInfo();

            aluno1.alterarPeso(70);
            aluno1.mostrarInfo();
            aluno2.mostrarInfo();
        }

}


