package aula10_excessoes.exercicio02_sondaespacial.view;
import aula10_excessoes.exercicio02_sondaespacial.model.CombustivelInsuficienteException;
import aula10_excessoes.exercicio02_sondaespacial.model.SistemaMissao;
import aula10_excessoes.exercicio02_sondaespacial.model.Sonda;

public class Main {
    public static void main(String[] args) {

        Sonda sondaEspacial = new Sonda("Aurora-7", 45.0, 12000);

        sondaEspacial.mostrarStatus();

        SistemaMissao sistemaMissao = new SistemaMissao();
        try {
            sistemaMissao.iniciarMissao(sondaEspacial);
        } catch(CombustivelInsuficienteException e) {
            System.out.println(e.getMessage());
        } finally {
                System.out.println("Tentativa de lançamento realizada");
        }

    }
}
