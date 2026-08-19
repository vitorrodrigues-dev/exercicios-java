package aula07_encapsulamento.exercicio05;

public class Filmes {

    private String nome;
    private String genero;

    public Filmes() {

    }

    public String getNome() {
        return nome;
    }

    public Filmes setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getGenero() {
        return genero;
    }

    public Filmes setGenero(String genero) {
        this.genero = genero;
        return this;
    }
}
