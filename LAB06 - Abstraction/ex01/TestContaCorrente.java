package lab06.ex01;

public class TestContaCorrente {

    public static void main(String[] args){


        ContaCorrente contaCorrente = new ContaCorrente(
                100,
                123,
                1234
        );

        contaCorrente.debitaValor(200);

        contaCorrente.creditaValor(1234, 200);
        float saldo = contaCorrente.getSaldo(1234);

        System.out.println(saldo);
    }
}
