package lab06.ex02;


public class ContaEspecial extends ContaCorrente {

    private float limite;

    public ContaEspecial(float limite, float saldo, int numConta, int senha) {
        super(saldo, numConta, senha, limite);
        if(limite <= 0) throw new IllegalArgumentException("Limite tem que ser positivo");
        this.limite = limite;
    }

    public ContaCorrente transformaEmContaNormal(){
        return new ContaNormal(saldo, numConta, senha);
    }

    @Override
    public boolean debitaValor(float valor, int senha){
        if(this.senha != senha) return false;
        if(this.estado != 1) return false;
        if(valor <= 0) return false;
        if(valor > this.saldo) return false;

        this.saldo -= valor;
        return true;
    }



}
