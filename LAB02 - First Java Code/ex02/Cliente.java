package ex02;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Cliente {
    
    private final Long id;
    private final String cpf;
    private final String nome;
    private final String cep;
    private final LocalDate dataNascimento;
    
    public Cliente(String cpf, String nome, String cep, LocalDate dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
        this.id = -1L;
    }

    private Cliente(Long id, String cpf, String nome, String cep, LocalDate dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
        this.id = id;
    }

    public Optional<UUID> cadastra(RepositorioClienteEmMemoria repositorio){
        return repositorio.salvar(this);
    }

}