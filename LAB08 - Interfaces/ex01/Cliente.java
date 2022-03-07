package lab08;

public class Cliente implements Classificavel{

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean ehMenorQue(Classificavel obj) {
        Cliente outroCliente = (Cliente) obj;
        return this.nome.compareTo(outroCliente.getNome()) <= 0;
    }

    public String getNome(){
        return this.nome;
    }

}
