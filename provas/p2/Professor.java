package p2;

import java.util.Date;

public class Professor extends Pessoa implements Senioridade{
    String NumeroFuncional;
    Date DataContrato;

    public Professor(String numeroFuncional, String nome, String CPF, Date dataContrato) {
        super(nome, CPF);
        this.NumeroFuncional = numeroFuncional;
        this.DataContrato = dataContrato;
    }

    public Professor(String numeroFuncional, String nome, String CPF) {
        super(nome, CPF);
        this.NumeroFuncional = numeroFuncional;
    }

    @Override
    public String gerarCertificado() {
        return "Certifico que o " + this.Nome + " é orientador de estudantes";
    }

    @Override
    public void registraEstadoVacina(boolean vacinou) {
        this.vacinou = vacinou;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        Professor outroProfessor = (Professor) obj;
        return this.DataContrato.after(outroProfessor.DataContrato);
    }

}
