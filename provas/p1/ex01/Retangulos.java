package ex01;

public class Retangulos {
    private Retangulo[] retangulos;

    public Retangulos(Retangulo[] retangulos){
        this.retangulos = retangulos;
    }

    public double calculeMaiorArea(){
        double maiorAreaAteEntao = Double.MIN_VALUE;
        int tamanho = retangulos.length;
        int posAtual = 0;
        while(posAtual < tamanho){
            Retangulo retanguloAtual = retangulos[posAtual];
            if(retanguloAtual.getArea() > maiorAreaAteEntao){
                maiorAreaAteEntao = retanguloAtual.getArea();
            }
            posAtual++;
        }
        return maiorAreaAteEntao;
    }

}
