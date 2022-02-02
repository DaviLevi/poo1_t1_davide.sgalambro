package ex02;

import java.time.LocalDate;

public class Vendedor extends Funcionario{
    
    private double comissao;
    private double vendas;

    public Vendedor(double salario, String nome, LocalDate dataNascimento, double comissao, double vendas) {
        super(salario, nome, dataNascimento);
        this.comissao = comissao;
        this.vendas = vendas;
    }
    

    @Override
    public double getSalario(){
        return this.comissao * this.vendas;
    }


    // Vendedor: valor fixo + comissão X vendas;

}
