package aula10_excessoes.exercio03_satelite.model;

public class Satelite {
    private String nome;
    private double temperatura;
    private double energia;

    public Satelite(double energia, double temperatura, String nome) {
        this.energia = energia;
        this.temperatura = temperatura;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }
}
