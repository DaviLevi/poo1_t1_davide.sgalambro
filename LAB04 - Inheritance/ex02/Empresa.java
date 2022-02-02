package ex02;

import java.time.LocalDate;

public class Empresa {
    public static void main(String[] args){


        Funcionario[] funcionariosContratados = {
            new Chefe(10.000, "Chefe chato", LocalDate.of(1990, 1, 1)),
            new Horista("Bruno", LocalDate.of(1990, 1, 1), 1.0, 1),
            new Operario("Alice", LocalDate.of(1990, 1, 1), 10.0, 1),
            new Vendedor(1200.00, "Davide", LocalDate.of(1990, 1, 1), 0.2, 200)
        };

        new FolhaPagamento().processa(funcionariosContratados);

    }
}
