package lab06.ex02;

import lab06.ex02.ContaCorrente;

public class ContaNormal extends ContaCorrente {
    public ContaNormal(float saldo, int numConta, int senha) {
        super(saldo, numConta, senha, 0);
    }
}
