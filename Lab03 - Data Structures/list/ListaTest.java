public class ListaTest {
    

    public static void main(String[] args){
        Lista lista = new Lista();

        lista.adicionaFim(1);
        lista.adicionaInicio(0);
        lista.deletaPosicao(0);
        lista.adicionaPosicao(0, 1);

        lista.esvazia();
        lista.excluiPrimeiro();
        lista.excluiUltimo();

        lista.primeiro();
        lista.ultimo();

        lista.print();

        lista.contem(1);

        System.out.println(lista.tamanho());
        System.out.println(lista.buscaValorNaPosicao(3));
    }

}
