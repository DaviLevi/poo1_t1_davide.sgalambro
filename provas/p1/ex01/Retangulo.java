package ex01;

public class Retangulo {
    
    private Ponto ponto1;
    private Ponto ponto2;

    public Retangulo(Ponto ponto1, Ponto ponto2){
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public double getArea(){
        double x1 = ponto1.getX();
        double x2 = ponto2.getX();

        double y1 = ponto1.getY();
        double y2 = ponto2.getY();

        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

}
