package ex02;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    private List<Cliente> proprietarios;
    private Agencia agencia;
    private String numeroIdentificacao;
    private LocalDate dataCriacao;
    private LocalDate dataUltimoAcesso;
    private BigDecimal saldo;
}
