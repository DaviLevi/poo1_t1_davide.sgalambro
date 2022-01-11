package ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RepositorioProdutoEmMemoria {
    private final Map<UUID, Produto> bancoDeDados = new HashMap<>();

    public Optional<UUID> salvar(Produto produto){
        UUID novoId = UUID.randomUUID();
        var result = bancoDeDados.put(novoId, produto);
        if(result == null) return Optional.of(novoId);
        return Optional.ofNullable(null);
    }
}