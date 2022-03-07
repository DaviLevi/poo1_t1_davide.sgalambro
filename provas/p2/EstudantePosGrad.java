package p2;

public class EstudantePosGrad extends Estudante implements Senioridade{
    int CargaHorariaDisciplinas;
    String Nivel; // doutorado ou mestrado
    String TemaProjetoPesquisa;

    public EstudantePosGrad(String CPF, String matricula, String nome) {
        super(matricula, nome, CPF);
    }

    public int getCargaHorariaDisciplinas() {
        return CargaHorariaDisciplinas;
    }

    public void setCargaHorariaDisciplinas(int cargaHorariaDisciplinas) {
        CargaHorariaDisciplinas = cargaHorariaDisciplinas;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        Nivel = nivel;
    }

    public String getTemaProjetoPesquisa() {
        return TemaProjetoPesquisa;
    }

    public void setTemaProjetoPesquisa(String temaProjetoPesquisa) {
        TemaProjetoPesquisa = temaProjetoPesquisa;
    }

    public void informacoesEstudantePos(){
        System.out.println("Nome: " + Nome);
        System.out.println("CPF: " + CPF);
        System.out.println("Matricula: " + this.matricula );
        System.out.println("Carga Horária: " +  CargaHorariaDisciplinas);
        System.out.println("Nível: " +  Nivel);
        System.out.println("Tema de pesquisa: " +  TemaProjetoPesquisa);
    }

    @Override
    public String gerarCertificado() {
        return "Certifico que o " + this.Nome  +" participa do projeto  " + this.TemaProjetoPesquisa;
    }

    @Override
    public void registraEstadoVacina(boolean vacinou) {
        this.vacinou = vacinou;
    }

    @Override
    public boolean ehSenior(Senioridade obj) {
        EstudantePosGrad outroEstudanteGrad = (EstudantePosGrad) obj;
        return this.Nivel.equals("doutorado") && outroEstudanteGrad.Nivel.equals("mestrado");
    }
}

