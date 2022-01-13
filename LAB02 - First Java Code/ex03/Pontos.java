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

    public Ponto pontoMaisAEsquerda(){
        Ponto pontoMaxEsquerda = null;
        float esquerdaMin = Float.MAX_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float esquerdaAtual = pontoAtual.getX();
            if(esquerdaAtual < esquerdaMin){
                esquerdaMin = esquerdaAtual; 
                pontoMaxEsquerda = pontoAtual;
            }
        }
        return pontoMaxEsquerda;
    }


    // nao consegui replicar e terminar, falta de tempo
    public Ponto pontoMaisEmCima(){
        Ponto pontoMaxCima = null;
        float cimaMax = Float.MIN_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float cimaAtual = pontoAtual.getY();
            if(cimaAtual > cimaMax){
                cimaMax = cimaAtual; 
                pontoMaxCima = pontoAtual;
            }
        }
        return pontoMaxCima;
    }

    public Ponto pontoMaisEmbaixo(){
        Ponto pontoMaxEmbaixo = null;
        float baixoMax = Float.MAX_VALUE;
        for(int i = 0; i < this.pontos.length; i++){
            Ponto pontoAtual = pontos[i];
            float baixoAtual = pontoAtual.getY();
            if(baixoAtual < baixoMax){
                baixoMax = baixoAtual; 
                pontoMaxEmbaixo = pontoAtual;
            }
        }
        return pontoMaxEmbaixo;
    }

}
