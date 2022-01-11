package ex02;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class RepositorioFuncionarioEmMemoria {

    private final Map<UUID, Funcionario> bancoDeDados = new HashMap<>();

    public Optional<UUID> salvar(Funcionario funcionario){
        UUID novoId = UUID.randomUUID();
        var result = bancoDeDados.put(novoId, funcionario);
        if(result == null) return Optional.of(novoId);
        return Optional.ofNullable(null);
    }
}
