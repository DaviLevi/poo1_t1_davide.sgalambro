package lab05.ex02;

public class Funcionario extends Pessoa{

    protected int matricula;
    protected float salarioBase;

    public Funcionario(String n, String cpf, String rg, int id, int matricula) {
        super(n, cpf, rg, id);
        this.matricula = matricula;
        this.salarioBase = 1000;
    }

    public float calculaSalario(){
        return salarioBase;
    }
}


