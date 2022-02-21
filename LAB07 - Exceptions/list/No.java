package lab07.list;

public class No {
    private No proximo;
    private int valor;

    public No(int valor){
        this.valor = valor;
    }

    public void setProximo(No proximo){
        this.proximo = proximo;
    }

    public No getProximo(){
        return proximo;
    }

    public int getValor(){
        return this.valor;
    }

    @Override
    public String toString(){
        return this.valor + "";
    }

    public boolean ehUltimo(){
        return this.proximo == null;
    }

    public boolean naoEhUltimo(){
        return this.proximo != null;
    }

    public boolean naoEhAntesUltimo(){
        return this.proximo.getProximo() != null;
    }
}
