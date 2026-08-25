package aula10_excessoes.exercicio02_sondaespacial.model;

public class Sonda {

    private String nomeMissao;
    private double combustivel;
    private double distanciaDestino;

    public Sonda() {

    }

    public Sonda(String nomeMissao, double combustivel, double distanciaDestino) {
        this.nomeMissao = nomeMissao;
        this.combustivel = combustivel;
        this.distanciaDestino = distanciaDestino;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public void setDistanciaDestino(double distanciaDestino) {
        this.distanciaDestino = distanciaDestino;
    }

    public void mostrarStatus() {
        System.out.println("=== STATUS DA SONDA ===");
        System.out.println("Missão: " + nomeMissao);
        System.out.println("Combustível: " + combustivel + "%");
        System.out.println("Distância: " + distanciaDestino + " km");
    }

}
