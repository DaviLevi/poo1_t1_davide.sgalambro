package ex01;

public class Ponto {
    private double x;
    private double y;

    // quando a coordenada x for igual a y
    // ex :  (1,1), (2,2) etc
    public Ponto(double x){
        this.x = x;
        this.y = x;
    }

    // quando a coordenada x for diferente de y
    // ex :  (1,2), (2,1) etc
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

}