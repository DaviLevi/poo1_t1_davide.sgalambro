package lab06.ex03;

import lab06.ex02.ContaCorrente;
import lab06.ex02.ContaEspecial;

public class UsaBanco {

    public static void main(String[] args){
        ContaCorrente contaCorrente =
                ContaCorrente.com(100, 100,
                          20040, 1234);

        boolean resultado = contaCorrente.debitaValor(100, 1234);

        contaCorrente.creditaValor(100, 1234);
        contaCorrente.debitaValor(100, 1234);


        ContaEspecial conta = new ContaEspecial(100, 100,
                20040, 1234);

        ContaCorrente contaNormal = conta.transformaEmContaNormal();

        System.out.println(contaCorrente.getSaldo(1234));
    }


}
