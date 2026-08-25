package aula10_excessoes.exercio03_satelite.view;

import aula10_excessoes.exercicio02_sondaespacial.model.SistemaMissao;
import aula10_excessoes.exercio03_satelite.model.EnergiaInsuficienteException;
import aula10_excessoes.exercio03_satelite.model.Satelite;
import aula10_excessoes.exercio03_satelite.model.SistemaLancamento;
import aula10_excessoes.exercio03_satelite.model.TemperaturaCriticaException;

public class Main {
    public static void main(String[] args) {

        Satelite satelite = new Satelite(10, 85, "SpaceExc");
        SistemaLancamento sistema = new SistemaLancamento();

        try {
            sistema.autorizarLancamento(satelite);
        } catch (EnergiaInsuficienteException e) {
            System.out.println(e.getMessage());
        } catch (TemperaturaCriticaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Processo de autorização encerrado.");
        }

    }
}
