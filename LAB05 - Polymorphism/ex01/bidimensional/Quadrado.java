package lab05.ex01.bidimensional;

public class Quadrado extends FormaBidimensional{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double obterArea(){
        return lado * lado;
    }

    @Override
    public String descreve(){
        return "Sou um quadrado";
    }

}
