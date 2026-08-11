package aula03;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Herói");
        String nomeHeroi = scanner.nextLine();


        Personagem heroi = new Personagem(nomeHeroi, 100, 15);

        Personagem vilao = new Personagem("Sombra", 120, 12);
    }


}
