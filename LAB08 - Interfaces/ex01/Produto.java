package lab08;

public class Produto implements Classificavel{

    private int codigo;

    public Produto(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean ehMenorQue(Classificavel obj) {
        Produto outroProduto = (Produto) obj;
        return this.codigo <= outroProduto.getCodigo();
    }

    public int getCodigo(){return this.codigo;};

}
