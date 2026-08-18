package aula07_encapsulamento.exercicio04;

public class ProdutoTestar {
    public static void main(String[] args) {

        Produto produto1 = new Produto();

        produto1.setNome("Amaciante");
        System.out.println("Nome do produto: " + produto1.getNome());

        produto1.setQuantidade(10);
        // System.out.println("Quantidade do produto: " + produto1.getQuantidade());

        produto1.adicionarUnidades(132);
        //System.out.println("Quantidade do produto: " + produto1.getQuantidade());

        produto1.removerUnidades(2);
        System.out.println("Quantidade do produto: " + produto1.getQuantidade());

    }
}
