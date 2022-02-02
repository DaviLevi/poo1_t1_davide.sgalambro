package ex01;

public class Produto {
    protected String codigo;
    protected String descricao;
    protected int quantidade;

    public Produto(String codigo, String descricao, int quantidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int retiraQuantidade(int quantidadeDesejada){
        int quantidadeRetirada = Math.min(this.quantidade, quantidadeDesejada);
        this.quantidade = this.quantidade - quantidadeRetirada;
        return quantidadeRetirada;
    }

    public void acrescentaQuantidade(int quantidadeDesejada){
        this.quantidade = this.quantidade + quantidadeDesejada;
    }

}
