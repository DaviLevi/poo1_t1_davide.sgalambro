public class Lista {
    private No cabeca;
    private int tamanho;

    public Lista(){
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void adicionaFim(int valor){
        if(tamanho() == 0) {cabeca = new No(valor); this.tamanho++; return;}
        No noatual = cabeca;
        while(noatual.naoEhUltimo()){
            noatual = noatual.getProximo();
        }
        noatual.setProximo(new No(valor));
        this.tamanho++;
    }

    public void adicionaPosicao(int posicao, int valor){
        if(tamanho() == 0 || posicao < 0 || posicao >= tamanho()) return;
        if(posicao == 0) {adicionaInicio(valor); return;}
        if(posicao == (tamanho - 1)) {adicionaFim(valor); return;}
        int posicaoAtual = 0;
        No noAtual = cabeca;
        while(posicaoAtual < posicao) {
            noAtual = cabeca.getProximo();
            posicaoAtual++;
        }
        No novoNo = new No(valor);
        novoNo.setProximo(noAtual.getProximo());
        noAtual.setProximo(novoNo);
        this.tamanho++;
    }

    public void adicionaInicio(int valor){
        No novoNo = new No(valor);
        if(tamanho() == 0) {cabeca = novoNo; this.tamanho++; return;}
        novoNo.setProximo(cabeca);
        this.cabeca = novoNo;
        this.tamanho++;
    }

    public void print(){
        No noatual = cabeca;
        System.out.print("[ ");
        while(noatual != null){
            System.out.print(noatual.toString() + (noatual.getProximo() != null ? ", " : ""));
            noatual = noatual.getProximo();
        }
        System.out.println(" ]");
    }

    public int excluiUltimo(){
        if(tamanho() == 0) {throw new IllegalStateException("Lista vazia");}
        if(tamanho() == 1) {int valor = this.cabeca.getValor(); this.cabeca = null; tamanho--; return valor;}
        No noatual = cabeca;
        while(noatual.naoEhAntesUltimo()){
            noatual = noatual.getProximo();
        }
        int valor = noatual.getProximo().getValor();
        noatual.setProximo(null);
        this.tamanho--;
        return valor;
    }

    public int excluiPrimeiro(){
        if(tamanho() == 0) {throw new IllegalStateException("Lista vazia");}
        if(tamanho() == 1) {int valor = this.cabeca.getValor(); this.cabeca = null; tamanho--; return valor;}
        No novaCabeca = this.cabeca.getProximo();
        this.cabeca = novaCabeca;
        this.tamanho--;
        return this.cabeca.getValor();
    }

    public int primeiro(){
        assert this.tamanho > 0;
        return this.cabeca.getValor();    
    }

    public int ultimo(){
        assert this.tamanho > 0;
        if(tamanho() == 1) {return primeiro();}
        No noatual = cabeca;
        while(noatual.naoEhUltimo()){
            noatual = noatual.getProximo();
        }
        return noatual.getValor();
    }

    public void esvazia(){
        this.cabeca = null;
        this.tamanho = 0;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public void deletaPosicao(int posicao){
        if(tamanho() == 0 || posicao < 0 || posicao >= tamanho()) return;
        if(posicao == 0) {excluiPrimeiro(); return;}
        if(posicao == (tamanho - 1)) {excluiUltimo(); return;}
        int posicaoAtual = 0;
        No noAtual = cabeca;
        while(posicaoAtual < posicao - 1) {
            noAtual = cabeca.getProximo();
            posicaoAtual++;
        }
        noAtual.setProximo(noAtual.getProximo().getProximo());
        this.tamanho--;
    }

    public int buscaValorNaPosicao(int posicao){
        if(this.tamanho == 0) {throw new IllegalStateException("Lista vazia");}
        if( posicao < 0 || 
            posicao >= this.tamanho) throw new IllegalArgumentException("Posicao fora do range de indices disponiveis");

        if(posicao == 0) {return primeiro();}
        if(posicao == (tamanho - 1)) {return ultimo();}
        int posicaoAtual = 0;
        No noAtual = cabeca;
        while(posicaoAtual < posicao) {
            noAtual = cabeca.getProximo();
            posicaoAtual++;
        }
        return noAtual.getValor();
    }

    public boolean contem(int valor){
        if(tamanho() == 0) return false;
        No noAtual = cabeca;
        while(noAtual.naoEhUltimo()) {
            if(noAtual.getValor() == valor) return true;
            noAtual = cabeca.getProximo();
        }
        return false;
    }

    public int buscaPosicaoDoValor(int valor){
        if(this.tamanho == 0) {throw new IllegalStateException("Lista vazia");}
        int posicaoAtual = 0;
        No noAtual = cabeca;
        while(noAtual.naoEhUltimo()) {
            if(noAtual.getValor() == valor) return posicaoAtual;
            noAtual = cabeca.getProximo();
            posicaoAtual++;
        }
        return -1;
    }


    // inser_sorted

}
