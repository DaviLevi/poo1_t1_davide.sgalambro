package ex02;

import java.util.Optional;
import java.util.UUID;

public class Produto {
    private final String codigo;
    private final String nome;
    private final String fabricante;
    private final double preco;

    public Produto(String codigo,
                    String nome,
                    String fabricante,
                    double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
    }

    public Optional<UUID> cadastra(RepositorioProdutoEmMemoria repositorio){
        return repositorio.salvar(this);
    }

}


