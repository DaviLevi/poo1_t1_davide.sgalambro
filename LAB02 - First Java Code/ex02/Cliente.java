package ex02;

import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public class Cliente {
    private final String cpf;
    private final String nome;
    private final String cep;
    private final LocalDate dataNascimento;
    
    public Cliente(String cpf, String nome, String cep, LocalDate dataNascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.cep = cep;
        this.dataNascimento = dataNascimento;
    }

    public Optional<UUID> cadastra(RepositorioClienteEmMemoria repositorio){
        return repositorio.salvar(this);
    }

}