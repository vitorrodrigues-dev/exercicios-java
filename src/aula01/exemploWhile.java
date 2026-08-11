package aula01;

public class exemploWhile {
    public static void main(String[] args) {

        // [PASSO 1]: PREPARAÇÃO DA VARIÁVEL (O CONTADOR)
        // Você precisa criar e dar um valor inicial ANTES do laço começar.
        int contador = 1;

        // [PASSO 2]: O GUARDA DA ENTRADA (CONDIÇÃO ENTRE PARÊNTESES)
        // O computador lê: "Enquanto o contador for menor ou igual a 3, FAÇA..."
        // Se essa condição nascer falsa, o Java pula direto para fora das chaves.
        while (contador <= 3) { // ◄--- ABRE AS CHAVES: Começa a sala de repetição!

            // [PASSO 3]: REGRAS DE INDENTAÇÃO (O VISUAL DO CÓDIGO)
            // Note os 4 espaços de recuo (margem) aqui embaixo.
            // Para o Java, esses espaços não importam; servem apenas para VOCÊ
            // bater o olho e saber que esta linha está "presa" dentro do while.
            System.out.println("Executando a repetição número: " + contador);

            // [PASSO 4]: O MOTOR DE AVANÇO (INCREMENTO EXCLUSIVO DO JAVA)
            // O comando '++' soma +1 na variável a cada volta.
            // Equivalente ao "contador += 1" do Python.
            // ATENÇÃO: Se apagar essa linha, o loop fica infinito e trava o sistema!
            contador++;

        } // ◄--- FECHA AS CHAVES: Fim da sala de repetição!
        // O Java decide se volta para o topo do while ou se sai puramente por esta chave.

        // CÓDIGO FORA DO LAÇO
        System.out.println("Loop encerrado! O contador terminou valendo: " + contador);

    }
}
