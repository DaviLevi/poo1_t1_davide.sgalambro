public class Banco_v0 {
    public static void main(String[] args) {
        Conta_v0 c1 = new Conta_v0();
        c1.setSaldo ( 1000 );
        c1.setLimite ( 1000 );
        double saldoAtual = c1.getSaldo ();
        System.out.println(" Saldo atual é " + saldoAtual );
        double limiteConta = c1.getLimite(); 
        System.out.println(" Limite é " + limiteConta );
    }
}
