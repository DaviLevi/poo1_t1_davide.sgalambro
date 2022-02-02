package ex01;

public class ProdutoComPreco extends Produto{

    private double precoUnitario;

    public ProdutoComPreco(double precoUnitario, String codigo, String descricao, int quantidade) {
        super(codigo, descricao, quantidade);
        this.precoUnitario = precoUnitario;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void atualizaPrecoUnitario(double novoPrecoUnitario) {
        if(novoPrecoUnitario > 0) this.precoUnitario = precoUnitario;
    }
}
