package lab05.ex01.tridimensional;

public class Cubo extends FormaTridimensional{

    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return 6 * lado * lado;
    }

    public double obterVolume(){
        return lado * lado * lado;
    }

    @Override
    public String descreve(){
        return "Sou um cubo";
    }

}
