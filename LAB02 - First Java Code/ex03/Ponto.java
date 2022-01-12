package ex03;

public class Ponto {
    private float x;
    private float y;

    public Ponto(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }



    public Ponto mais(Ponto outroPonto){
        Ponto soma = new Ponto(this.x + outroPonto.x, this.y + outroPonto.y);
        return soma;
    }

    public Ponto multiplica(float costante){
        return new Ponto(this.x * costante, this.y * costante);
    }

    public void multiplicaVoid(float costante){
        this.x = this.x * costante;
        this.y = this.y * costante;
    }

    public static void somaTerceiro(Ponto ponto1, Ponto ponto2, Ponto ponto3){

        Ponto pontoSoma =  ponto1.mais(ponto2);
        
        ponto3.setX(pontoSoma.getX());
        ponto3.setY(pontoSoma.getY());

    }

    
    public void inc_dir(char direcao){
        switch(direcao){
            case 'l': this.x = this.x + 1.0F;
            case 'o': this.x = this.x - 1.0F;
            case 'n': this.y = this.y + 1.0F;
            case 's': this.y = this.y - 1.0F;
            default: ;
        }
    }

    public void ind_diag(String direcao){
        switch(direcao){
            case "sudeste":
                this.x = this.x + 1.0F;
                this.y = this.y - 1.0F;
            case "sudoeste":
                this.x = this.x - 1.0F;
                this.y = this.y - 1.0F;
            default: ;
        }
    } 

    public static void calculaAreaRetangulo(Ponto ponto1, Ponto ponto2){



    
    }







    public float getX(){
        return x;
    }

    public float getY(){
        return y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void setY(float y){
        this.y = y;
    }

}
