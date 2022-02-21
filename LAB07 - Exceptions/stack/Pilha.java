public class Pilha {
    private Lista lista = new Lista();

    public void push(int valor){
        lista.adicionaFim(valor);
    }

    public int size(){
        return lista.tamanho();
    }

    public int pop(){
        return lista.excluiUltimo();
    }

    public int top(){
        return lista.ultimo();
    }

    public void print(){
        lista.print();
    }
    
}


//push
//size
//pop
//top
//print
