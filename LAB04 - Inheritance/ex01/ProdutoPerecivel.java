package ex01;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ProdutoPerecivel extends Produto{

    protected LocalDate dataValidade;

    public ProdutoPerecivel(String codigo, String descricao, int quantidade, LocalDate dataValidade) {
        super(codigo, descricao, quantidade);
        this.dataValidade = dataValidade;
    }

    public int retiraQuantidade(int quantidadeDesejada, LocalDate diaCorrente){
        if(dataValidade.plus(60, ChronoUnit.DAYS).isBefore(diaCorrente)){
            int quantidadeRetirada =  Math.min(this.quantidade, quantidadeDesejada);
            this.quantidade = this.quantidade - quantidadeRetirada;
            return quantidadeRetirada;
        }else{
            this.quantidade = 0;
            return 0;
        }
    }

    @Override
    public void acrescentaQuantidade(int quantidadeDesejada){
        if(this.quantidade == 0) this.quantidade = this.quantidade + quantidadeDesejada;
    }

    // 1 Ottobre
    // 2 Dicembre


}
