package ex02;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Funcionario {
    private final String cpf;
    private final String nome;
    private final LocalDate dataNascimento;
    private final LocalDate dataIngresso;

    public Funcionario(String cpf, String nome, LocalDate dataIngresso, LocalDate dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataIngresso = dataIngresso;
        this.dataNascimento = dataNascimento;
    }

    public Optional<UUID> cadastra(RepositorioFuncionarioEmMemoria repositorio){
        return repositorio.salvar(this);
    }
}
