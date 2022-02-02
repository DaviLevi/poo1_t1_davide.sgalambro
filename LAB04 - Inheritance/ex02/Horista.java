package ex02;

import java.time.LocalDate;

public class Horista extends Funcionario{

    private double valorPorHora;
    private int horasTrabalhadas;


    public Horista(String nome, LocalDate dataNascimento, double valorPorHora, int horasTrabalhadas){
        super(0, nome, dataNascimento);
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    @Override
    public double getSalario(){
        return valorPorHora * horasTrabalhadas;
    }
    
}
