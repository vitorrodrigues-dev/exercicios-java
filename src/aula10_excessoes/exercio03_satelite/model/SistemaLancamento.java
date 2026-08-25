package aula10_excessoes.exercio03_satelite.model;

public class SistemaLancamento {

    public void autorizarLancamento(Satelite satelite) throws TemperaturaCriticaException, EnergiaInsuficienteException{

        if (satelite.getTemperatura() > 80) {
            throw new TemperaturaCriticaException("Temperatura excede o máximo de 80\nTemperatura atual: " + satelite.getTemperatura());
        } if (satelite.getEnergia() < 30) {
            throw new EnergiaInsuficienteException("Energia mínima necessária de 30 não atingida!\nEnergia atual: " + satelite.getEnergia());
        }


    }
}



