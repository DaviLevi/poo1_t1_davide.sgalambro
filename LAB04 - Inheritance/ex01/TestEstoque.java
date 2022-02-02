package ex01;

import java.util.List;
import java.util.Optional;

public class TestEstoque {

    public static void main(String[] args){
        Estoque estoque = new Estoque();

        estoque.cadastra(new ProdutoComPreco(10D, "SKU123", "Produto de limpeza", 2));

        Optional<ProdutoComPreco> possivelProduto = estoque.consultar("SKU123");

        estoque.retiraQuantidade("SKU123", 10);
        estoque.acrescentaQuantidade("SKU123", 10);
        double custoTotal = estoque.getCustoTotal();

        possivelProduto.ifPresent(p -> System.out.println("Quantidade remanente : " + p.quantidade));

        System.out.println(Math.min(2, 10));

        System.out.println("Custo total : " + custoTotal);
    }
}
