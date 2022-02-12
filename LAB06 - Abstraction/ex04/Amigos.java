package lab06.ex06;

import java.time.LocalDate;

public class Amigos extends Contato{

    private int grau;

    public Amigos(String apelido, String nome,
                  String email, LocalDate aniversario,
                  int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }


    @Override
    public void imprmirContato() {
        System.out.println(super.imprmirBasico());
    }
}
