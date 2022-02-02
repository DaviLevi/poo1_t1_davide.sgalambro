package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Estoque {
    private List<ProdutoComPreco> produtosEmEstoque;

    public Estoque(){
        this.produtosEmEstoque = new ArrayList<>();
    }

    public Estoque(List<ProdutoComPreco> produtos){
        this.produtosEmEstoque = produtos;
    }

    public void cadastra(ProdutoComPreco novoProduto){
        produtosEmEstoque.add(novoProduto);
    }

    public Optional<ProdutoComPreco> consultar(String codigo){
        return produtosEmEstoque.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst();
    }

    public void acrescentaQuantidade(String codigo, int quantidadeDesejada){
        Optional<ProdutoComPreco> produtoEncontrado = consultar(codigo);
        produtoEncontrado.ifPresent(p -> p.acrescentaQuantidade(quantidadeDesejada));
    }

    public void retiraQuantidade(String codigo, int quantidadeDesejada){
        Optional<ProdutoComPreco> produtoEncontrado = consultar(codigo);
        produtoEncontrado.ifPresent(p -> p.retiraQuantidade(quantidadeDesejada));
    }

    public double getCustoTotal(){
        return produtosEmEstoque.stream().map(ProdutoComPreco::getPrecoUnitario).reduce(0D, (acc, next) -> acc + next);
    }

}
