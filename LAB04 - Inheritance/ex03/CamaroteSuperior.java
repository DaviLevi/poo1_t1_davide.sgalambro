package ex03;

public class CamaroteSuperior extends VIP{

    public CamaroteSuperior(double valor, double adicional) {
        super(valor, adicional);
    }

    public double getValorIngresso(){
        return valor + this.adicional;
    }
}
