package ex03;

public class VIP extends Ingresso{
    protected double adicional;

    public VIP(double valor, double adicional) {
        super(valor);
        this.adicional = adicional;
    }

    @Override
    public void escreveValor(){
        System.out.println("Ingresso VIP :: valor : " + this.valor + this.adicional);
    }
}
