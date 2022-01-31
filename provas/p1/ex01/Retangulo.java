package ex01;

public class Retangulo {
    
    private Ponto ponto1;
    private Ponto ponto2;

    public Retangulo(Ponto ponto1, Ponto ponto2){
        if(ponto1.podeFormarUmRetanguloCom(ponto2)){
            this.ponto1 = ponto1;
            this.ponto2 = ponto2;
        }
        throw new IllegalArgumentException("Ai não da né mano");
    }
// check: estranha essa função, mas ok
    public Retangulo(Ponto ponto1, Ponto ponto2, Ponto ponto3, Ponto ponto4){
        if(ponto1.podeFormarUmRetanguloCom(ponto2)){
            this.ponto1 = ponto1;
            this.ponto2 = ponto2;
        }else
        if(ponto1.podeFormarUmRetanguloCom(ponto3)){
            this.ponto1 = ponto1;
            this.ponto2 = ponto3;
        }else
        if(ponto1.podeFormarUmRetanguloCom(ponto4)){
            this.ponto1 = ponto1;
            this.ponto2 = ponto4;
        }
        throw new IllegalArgumentException("Ai não da né mano");
    }

    public double getArea(){
        double x1 = ponto1.getX();
        double x2 = ponto2.getX();

        double y1 = ponto1.getY();
        double y2 = ponto2.getY();

        return Math.abs(x2 - x1) * Math.abs(y2 - y1);
    }

}
