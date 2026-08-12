package aula03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do Herói");
        String nomeHeroi = scanner.nextLine();

        Personagem heroi = new Personagem(nomeHeroi, 100, 15);
        Personagem vilao = new Personagem("Sombra", 120, 12);

        int turno = 1;

        System.out.println("\n=== COMBATE INICIADO ===");
        System.out.println(heroi.nome + " (" + heroi.vida + " de vida) vs "
                + vilao.nome + " (" + vilao.vida + " de vida)");

        while (turno <= 5 && heroi.estaVivo() && vilao.estaVivo()) {

            System.out.println("\n--- Turno " + turno + " ---");

            vilao.receberDano(heroi.ataque);

            System.out.println(heroi.nome + " atacou! " + vilao.nome
                    + " perdeu " + heroi.ataque + " de vida");

            vilao.mostrarStatus();

            if (vilao.estaVivo()) {

                heroi.receberDano(vilao.ataque);

                System.out.println(vilao.nome + " atacou! " + heroi.nome
                        + " perdeu " + vilao.ataque + " de vida");

                heroi.mostrarStatus();
            }

            turno++;
        }

        System.out.println("\n=== FIM DO COMBATE ===");

        if (heroi.estaVivo() && !vilao.estaVivo()) {
            System.out.println("Vitória do herói!");
        } else if (!heroi.estaVivo() && vilao.estaVivo()) {
            System.out.println("Vitória do vilão!");
        } else {
            System.out.println("Ninguém venceu em 5 turnos. Empate!");
        }

        scanner.close();
    }
}