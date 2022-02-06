package lab05.ex01.tridimensional;

public class Tetraedro extends FormaTridimensional{

    private double lado;
    private double altura;

    public Tetraedro(double lado, double altura){
        this.lado = lado;
        this.altura = altura;
    }

    public double obterArea(){
        return lado * lado * Math.sqrt(3);
    }

    public double obterVolume(){
        return 1/3 * obterArea() * altura;
    }

    @Override
    public String descreve(){
        return "Sou um tetraedro";
    }

}
