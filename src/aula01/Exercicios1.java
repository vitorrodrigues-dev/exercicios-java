package aula01;

public class Exercicios1 {
    public static void main(String[] args) {

        // --- EXERCÍCIO 1: Cadastro de Usuário (Tipos Primitivos) ---
        // Crie variáveis para guardar as informações de um produto:
        // Use byte para a idade de uma pessoa (ex: 25)
        // Use short para o ano de nascimento (ex: 2001)
        // Use int para o código do cliente (ex: 45892)
        // Use long para a população de uma cidade (ex: 12000000L - lembre do L no final!)
        // Use float para a altura (ex: 1.75f - lembre do f no final!)
        // Use double para o saldo bancário (ex: 1500.50)
        // Use char para a inicial do nome (ex: 'R' - com aspas simples!)
        // Use boolean para dizer se o cliente está ativo (ex: true)

        // Depois, use o System.out.println() para exibir pelo menos 3 dessas variáveis na tela.


        // --- EXERCÍCIO 2: Cálculo de Área ---
        // Declare duas variáveis do tipo double: 'base' e 'altura'.
        // Atribua valores de sua escolha para elas.
        // Crie uma terceira variável chamada 'area' que multiplica a base pela altura.
        // Exiba o resultado final com System.out.println("A área é: " + area);


        // --- EXERCÍCIO 3: Conversor de Temperatura ---
        // Declare uma variável double chamada 'celsius' com o valor 30.0.
        // Converta para Fahrenheit usando a fórmula: (celsius * 9 / 5) + 32
        // Guarde o resultado em uma variável double chamada 'fahrenheit' e exiba na tela.

        byte idade = 18;
        short anoDeNascimento = 2001;
        int codigo = 45892;
        long populacao = 12000000L;
        float altura = 1.71f;
        double saldoBancario = 1500.876;
        char inicial = 'A';
        boolean verdade = true;
        String nome = "Vitor";

        System.out.println("Nome do cliente: " + nome);
        System.out.println("Idade do cliente: " + idade);
        System.out.println("Altura do cliente: " + altura);

        double base = 5.5;
        double altura2 = 10.0;
        double area = (base * altura2);

        System.out.println("A aréa é igual a: " + area);

        double celsius = 30.0;
        double fahrenheit = ((celsius * 9 / 5) + 32);

        System.out.println("O resultado é :" + fahrenheit);



    }
}
