package ex03;
public class Pontos {
    

    private final Ponto[] pontos;


    public Pontos(Ponto[] pontos){
        assert pontos.length > 0;
        this.pontos = pontos;
    }


    public Ponto pontoMaisADireita(){
        Ponto pontoMaxDireita = null;
        float direitaMax = Float.MIN_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float direitaAtual = pontoAtual.getX();
            if(direitaAtual > direitaMax){
                direitaMax = direitaAtual; 
                pontoMaxDireita = pontoAtual;
            }
        }
        return pontoMaxDireita;
    }


    // nao consegui replicar e terminar, falta de tempo
    public Ponto pontoMaisEmCima(){
        Ponto pontoMaxDireita = null;
        float direitaMax = Float.MIN_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float direitaAtual = pontoAtual.getX();
            if(direitaAtual > direitaMax){
                direitaMax = direitaAtual; 
                pontoMaxDireita = pontoAtual;
            }
        }
        return pontoMaxDireita;
    }

    public Ponto pontoMaisEmbaixo(){
        Ponto pontoMaxDireita = null;
        float direitaMax = Float.MIN_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float direitaAtual = pontoAtual.getX();
            if(direitaAtual > direitaMax){
                direitaMax = direitaAtual; 
                pontoMaxDireita = pontoAtual;
            }
        }
        return pontoMaxDireita;
    }

}
