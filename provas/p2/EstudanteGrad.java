package p2;

public class EstudanteGrad extends Estudante implements Senioridade{
    int CargaHorariaDisciplinas;
    int CargaHorariaComplementar;
    String TituloTCC;
    String LocalEstagio;

    public EstudanteGrad(String cpf, String matricula, String nome) {
        super(matricula, nome, cpf);
    }

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        if(!(cargaHorariaDisciplinas > 0 && cargaHorariaDisciplinas <= 3000)) throw new ValorCargaHorariaInvalidoException();
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public int getCargaHorariaComplementar() {
        return CargaHorariaComplementar;
    }

    public void setCargaHorariaComplementar(int cargaHorariaComplementar) {
        CargaHorariaComplementar = cargaHorariaComplementar;
    }

    public String getTituloTCC() {
        return TituloTCC;
    }

    public void setTituloTCC(String tituloTCC) {
        TituloTCC = tituloTCC;
    }

    public String getLocalEstagio() {
        return LocalEstagio;
    }

    public void setLocalEstagio(String localEstagio) {
        LocalEstagio = localEstagio;
    }

    public void informacoesEstudanteGrad(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + this.matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
        System.out.println("Horas complementares: " +  CargaHorariaComplementar);
        System.out.println("Local do estágio: " +  CargaHorariaComplementar);
        System.out.println("Título do TCC: " +  TituloTCC);
    }

    @Override
    public String gerarCertificado() {
        return "Certifico que o " + this.Nome  + " realiza estágio em " + this.LocalEstagio;
    }

    @Override
    public void registraEstadoVacina(boolean vacinou) {
        this.vacinou = vacinou;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        EstudanteGrad outroEstudanteGrad = (EstudanteGrad) obj;
        return this.getCargaHorariaDisciplinas() > outroEstudanteGrad.getCargaHorariaDisciplinas();
    }


}
