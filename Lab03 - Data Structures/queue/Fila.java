public class Fila {
    private Lista lista = new Lista();

    public void push(int valor){
        lista.adicionaFim(valor);
    }

    public int size(){
        return lista.tamanho();
    }

    public int pop(){
        return lista.excluiPrimeiro();
    }

    public int front(){
        return lista.primeiro();
    }

    public void print(){
        lista.print();
    }
    
}


//push
//size
//pop
//front
//print