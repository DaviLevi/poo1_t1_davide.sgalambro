package ex02;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Funcionario {
    private String numeroFuncional;
    private String nome;
    private String numeroTelefone;
    private List<Dependente> dependentes;
    private Funcionario supervisor;
    private LocalDate dataAdmissao;
    private Agencia agencia;

    public Period getTempoServico(){
        LocalDate agora = LocalDate.now();
        return Period.between(dataAdmissao, agora);
    }
}

