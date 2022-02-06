package lab05.ex01.tridimensional;

public class Esfera extends FormaTridimensional{

    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double obterArea(){
        return 4 * Math.PI * raio * raio;
    }

    public double obterVolume(){
        return 4/3 * Math.PI * raio * raio * raio;
    }

    @Override
    public String descreve(){
        return "Sou um esfera";
    }

}
