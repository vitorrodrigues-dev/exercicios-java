package aula10_excessoes.exercicio02_sondaespacial.model;


public class SistemaMissao {

    public void iniciarMissao(Sonda sonda) throws CombustivelInsuficienteException  {
        if (sonda.getCombustivel() < 50) {
            throw new CombustivelInsuficienteException("Combustivel insuficiente!\nCombustivel atual: " + sonda.getCombustivel() + "\nMinímo necessário: 50%");
        }
        System.out.println("Missão iniciada!");
        }
    }






