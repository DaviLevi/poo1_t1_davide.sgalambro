package p2;

public abstract class Estudante extends Pessoa{
    protected String matricula;

    public Estudante(String matricula, String nome, String CPF) {
        super(nome, CPF);
        this.matricula = matricula;
    }


}
