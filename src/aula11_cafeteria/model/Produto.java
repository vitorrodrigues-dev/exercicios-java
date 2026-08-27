package aula11_cafeteria.model;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private int quantidadeDisponivel;

    public void mostrarDados(int codigo , String nome, double preco) {
         System.out.println("Código: " + codigo + "\nProduto: " + nome +"\nPreço: " + preco + "\nQuantidade: ");
    }

    public Produto() {

    }

    public Produto(int codigo, String nome, double preco, int quantidadeDisponivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
