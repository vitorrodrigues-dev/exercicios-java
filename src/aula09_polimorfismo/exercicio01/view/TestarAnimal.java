package aula09_polimorfismo.exercicio01.view;

import aula09_polimorfismo.exercicio01.model.Cachorro;
import aula09_polimorfismo.exercicio01.model.Gato;
import aula09_polimorfismo.exercicio01.model.Veterinario;

public class TestarAnimal {
    public static void main(String[] args) {


        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Veterinario veterinario = new Veterinario();

        veterinario.examinar(cachorro);
        veterinario.examinar(gato);




    }

}
