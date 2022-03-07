package lab08;

public class Servico implements Classificavel{

    private double preco;

    public Servico(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean ehMenorQue(Classificavel obj) {
        Servico outroServico = (Servico) obj;
        return this.preco <= outroServico.getPreco();
    }

    public double getPreco(){return this.preco;};

}
