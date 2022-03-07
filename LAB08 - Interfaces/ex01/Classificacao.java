package lab08;

import java.util.Arrays;

public class Classificacao {

    public static void main(String[] args) {
        Classificador classificador = new Classificador();

        Classificavel[] produtos = new Classificavel[]{
            new Produto(3),
            new Produto(2),
            new Produto(1)
        };

        Classificavel[] clientes = new Classificavel[]{
                new Cliente("Davide"),
                new Cliente("Carlos"),
                new Cliente("Alex")
        };

        Classificavel[] servicos = new Classificavel[]{
                new Servico(20),
                new Servico(1),
                new Servico(2)
        };

        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);


        System.out.println("\n==== Ordenacao produtos ====");

        Arrays.stream(produtos).forEach(it -> {
            Produto produto = (Produto)it;
            System.out.println("Produto codigo " + produto.getCodigo());
        });


        System.out.println("\n==== Ordenacao Clientes ====\n");

        Arrays.stream(clientes).forEach(it -> {
            Cliente cliente = (Cliente)it;
            System.out.println("Cliente nome " + cliente.getNome());
        });

        System.out.println("\n==== Ordenacao Servicos ====\n");

        Arrays.stream(servicos).forEach(it -> {
            Servico servico = (Servico)it;
            System.out.println("Servico preco " + servico.getPreco());
        });

    }

}
