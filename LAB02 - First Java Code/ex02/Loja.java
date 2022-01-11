package ex02;

import java.time.LocalDate;

public class Loja {
    public static void main(String[] args){ 
        RepositorioClienteEmMemoria databaseCliente = new RepositorioClienteEmMemoria();
        RepositorioFuncionarioEmMemoria databaseFuncionario = new RepositorioFuncionarioEmMemoria();
        RepositorioProdutoEmMemoria databaseProduto = new RepositorioProdutoEmMemoria();
        
        Cliente cliente = new Cliente("01606156233", "Davide Sgalambro", "38408170", LocalDate.now());
        Funcionario funcionario = new Funcionario("01606156233", "Davide Sgalambro", LocalDate.now(), LocalDate.now());
        Produto produto = new Produto("SKU123", "Macarrao", "Amalia", 3.40);
        
        cliente.cadastra(databaseCliente).ifPresent(System.out::println);
        funcionario.cadastra(databaseFuncionario).ifPresent(System.out::println);
        produto.cadastra(databaseProduto).ifPresent(System.out::println);
    }
}
