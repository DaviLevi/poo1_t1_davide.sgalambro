package lab06.ex06;

import java.time.LocalDate;

public class Trabalho extends Contato{

    private String tipo;

    public Trabalho(String apelido, String nome, String email, LocalDate aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprmirContato() {
        System.out.println(super.imprmirBasico());
    }

    public boolean ehColega(){
        return "colega".equals(this.tipo);
    }
}
