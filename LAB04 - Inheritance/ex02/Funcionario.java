package ex02;

import java.time.LocalDate;

public class Funcionario {
    private double salario;
    private String nome;
    private LocalDate dataNascimento;


    public Funcionario(double salario, String nome, LocalDate dataNascimento){
        this.salario = salario;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }


    public double getSalario(){
        return this.salario;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public String getNome(){
        return this.nome;
    }

}
