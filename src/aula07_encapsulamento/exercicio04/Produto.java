package aula07_encapsulamento.exercicio04;

public class Produto {

    private String nome;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("A quantidade deve ser positiva");
        }
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarUnidades(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Só é possível adicionar unidades positivas");
        }
    }

public void removerUnidades(int quantidade) {
    if (quantidade <= this.quantidade) {
        this.quantidade -= quantidade;
    } else {
        System.out.println("Erro! Coloque um valor inferior ao total de unidades existentes");
    }


}

}
