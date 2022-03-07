package p2;

public abstract class Pessoa {
    protected String Nome;
    protected String CPF;
    protected boolean vacinou;

    public Pessoa(String nome, String CPF) {
        Nome = nome;
        this.CPF = CPF;
    }

    public abstract String gerarCertificado();

    public abstract void registraEstadoVacina(boolean vacinou);
}
