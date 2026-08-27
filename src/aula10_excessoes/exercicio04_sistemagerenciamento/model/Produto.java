package aula10_excessoes.exercicio04_sistemagerenciamento.model;

public class Produto {

    private String nome;
    private int id;
    private int estoque;

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            estoque += quantidade;
            System.out.println("Produto adicionado com sucesso");
        }
    }

    public void removerEstoque(int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > estoque) {
            throw new EstoqueInsuficienteException("Erro, a quantidade removida deve ser menor ou igual a quantidade do estoque atual");
        }
        estoque = estoque - quantidade;
        System.out.println("Quantidade removida");
        }



    public Produto( int id, String nome, int estoque) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
    }
    public Produto() {}

    public int getEstoque() {
        return estoque;
    }
}
