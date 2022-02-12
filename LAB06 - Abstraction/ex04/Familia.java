package lab06.ex06;

import java.time.LocalDate;

public class Familia extends Contato{

    private String parentesco;

    public Familia(String apelido, String nome, String email, LocalDate aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprmirContato() {
        System.out.println(super.imprmirBasico());
    }
}
