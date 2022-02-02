package ex02;

import java.time.LocalDate;

public class Operario extends Funcionario{
    private double valorPorProducao;
    private int quantidadeProduzida;


    public Operario(String nome, LocalDate dataNascimento, double valorPorProducao, int quantidadeProduzida){
        super(0, nome, dataNascimento);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    @Override
    public double getSalario(){
        return valorPorProducao * quantidadeProduzida;
    }

}
