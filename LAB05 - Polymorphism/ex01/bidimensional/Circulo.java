package lab05.ex01.bidimensional;

public class Circulo extends FormaBidimensional{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double obterArea(){
        return Math.PI * this.raio * this.raio;
    }

    @Override
    public String descreve(){
        return "Sou um circulo";
    }

}
