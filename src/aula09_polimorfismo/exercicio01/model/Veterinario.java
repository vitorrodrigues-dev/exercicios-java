package aula09_polimorfismo.exercicio01.model;

public class Veterinario {

    public void examinar(Animal animal) {
        animal.fazerSom();
        System.out.println("O animal está sendo examinado");
    }

}
