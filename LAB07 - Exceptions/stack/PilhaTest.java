public class PilhaTest {
    public static void main(String[] args){
        Pilha pilha = new Pilha();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        pilha.pop();

        pilha.print();
    }
}
