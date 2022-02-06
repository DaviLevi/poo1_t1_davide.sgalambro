package lab05.ex01.bidimensional;

public class Triangulo extends FormaBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double obterArea(){
        return base * altura / 2;
    }

    @Override
    public String descreve(){
        return "Sou um triangulo";
    }
}
