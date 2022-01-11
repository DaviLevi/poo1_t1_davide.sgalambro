package ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RepositorioClienteEmMemoria{

    private final Map<UUID, Cliente> bancoDeDados = new HashMap<>();

    public Optional<UUID> salvar(Cliente cliente){
        UUID novoId = UUID.randomUUID();
        var result = bancoDeDados.put(novoId, cliente);
        if(result == null) return Optional.of(novoId);
        return Optional.ofNullable(null);
    }

}