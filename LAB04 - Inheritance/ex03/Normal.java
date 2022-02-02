package ex03;

public class Normal extends Ingresso{

    public Normal(double valor) {
        super(valor);
    }

    @Override
    public void escreveValor(){
        System.out.println("Ingresso Normal :: valor : " + this.valor);
    }

    public void descreve(){
        System.out.println("Ingresso Normal");
    }
}
