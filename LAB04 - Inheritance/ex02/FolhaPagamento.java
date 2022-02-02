package ex02;

public class FolhaPagamento {
    

    public void processa(Funcionario[] funcionarios){
        int quantidadeFuncionarios = funcionarios.length;
        int cont = 0;
        System.out.println("== Folha Pagamento ==");
        double despesaTotal = 0;
        while(cont < quantidadeFuncionarios){

            Funcionario funcionarioAtual = funcionarios[cont];
            
            int numeroFuncionarioNaFolha = cont+1;

            System.out.println(numeroFuncionarioNaFolha + " - " + funcionarioAtual.getNome() + " - " + funcionarioAtual.getClass().getSimpleName() + " - " + funcionarioAtual.getSalario());

            despesaTotal += funcionarioAtual.getSalario();
            cont++;
        }
        System.out.println("Despesa total : " + despesaTotal);
    }


}
