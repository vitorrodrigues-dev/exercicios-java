package aula04;

public class Main {
    public static void main(String[] args) {

        PersonagemMagico mago = new PersonagemMagico("Gandalf", 100, "Magia");

        mago.nome = "Gandalf";
        mago.nivelEnergia = 100;
        mago.poderMagico = "Magia";

        System.out.println(mago.nome + " Energia: " + mago.nivelEnergia + " Poder: " + mago.poderMagico);

        PersonagemMagico elfo = new PersonagemMagico("Legolas", 50, "Arqueira");

        elfo.nome = "Legolas";
        elfo.nivelEnergia = 50;
        elfo.poderMagico = "Arqueira";

        System.out.println(elfo.nome + " Energia: " + elfo.nivelEnergia + " Poder: " + elfo.poderMagico);


        PersonagemMagico cavaleiro = new PersonagemMagico("Branco");
        System.out.println(cavaleiro.nome + " Energia: " + cavaleiro.nivelEnergia + " Poder: " + cavaleiro.poderMagico);

    }
}
