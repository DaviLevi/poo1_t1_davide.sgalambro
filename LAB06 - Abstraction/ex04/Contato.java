package lab06.ex06;

import java.time.LocalDate;

public abstract class Contato {

    private String apelido;
    private String nome;
    private String email;
    private LocalDate aniversario;

    public Contato(String apelido, String nome, String email, LocalDate aniversario) {
        this.apelido = apelido;
        this.nome = nome;
        this.email = email;
        this.aniversario = aniversario;
    }

    public String imprmirBasico(){
        return "Contato{" +
                "apelido='" + apelido + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", aniversario=" + aniversario +
                '}';
    }

    public abstract void imprmirContato();

}
