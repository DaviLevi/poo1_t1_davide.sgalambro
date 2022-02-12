package lab06.ex01;

public class ContaCorrente {

    private float saldo;
    private int estado;
    private int numConta;
    private int senha;

    public ContaCorrente(float saldo, int numConta, int senha){
        this.numConta = numConta;
        this.senha = senha;
        this.saldo = saldo;
        this.estado = 1;
    }

    public boolean debitaValor(float valor, int senha){
        if(this.senha != senha) return false;
        if(this.estado != 1) return false;
        if(valor <= 0) return false;
        if(valor > this.saldo) return false;

        this.saldo -= valor;
        if(saldo == 0) this.estado = 2;
        return true;
    }

    public void debitaValor(float valor){
        this.saldo -= valor;
    }

    public float getSaldo(int senha){
        if(this.senha == senha) return saldo;
        return -1;
    }

    public void creditaValor( int senha, float valor){
        if( this.senha == senha ) this.saldo += valor;
    }

    protected int getEstado(int senha){
        if(this.senha == senha) return this.estado;
        return -1;
    }

    protected void atualizaEstado( int senha, int novoEstado){
        if(this.senha == senha) this.estado = novoEstado;
    }

    protected boolean isSenha(int senha){
        return this.senha == senha;
    }



}
