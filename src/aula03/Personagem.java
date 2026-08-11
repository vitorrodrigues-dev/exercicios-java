package aula03;

public class Personagem {
    String nome;
    int vida;
    int ataque;

    public Personagem (String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void receberDano(int dano) {
        this.vida = this.vida - dano;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
