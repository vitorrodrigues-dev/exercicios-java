package aula06;

public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.ano = 2015;
        carro1.marca = "Fiat";
        carro1.modelo = "Doblô";
        carro1.velocidade = 100;

        carro1.freiar(10);

        System.out.println(carro1.velocidade);






    }
}
