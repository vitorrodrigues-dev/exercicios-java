package aula07_encapsulamento.exercicio05;

public class FilmesVistos {
   public static void main(String[] args) {

       Filmes filme1 = new Filmes();

       filme1.setNome("Titanic")
               .setGenero("Comedia");

       System.out.println(filme1.getGenero() + filme1.getNome());


    }
}
