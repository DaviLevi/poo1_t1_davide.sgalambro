package ex01;

import java.time.LocalDate;

public class ProdutoPerEsp extends ProdutoPerecivel{
    public ProdutoPerEsp(String codigo, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, descricao, quantidade, dataValidade);
    }

//    Oferece uma rotina de impressão de dados capaz de imprimir uma nota
//    de controle onde consta o código, a descrição, a quantidade em
//    estoque e a data de validade do produto

    public void imprime(){
        System.out.println("== Nota Controle Produto per Esp ==");
        System.out.println("Codigo : " + codigo);
        System.out.println("Descricao : " + descricao);
        System.out.println("Quantidade em estoque : " + quantidade);
        System.out.println("Data de validade : " + dataValidade);
    }

}
