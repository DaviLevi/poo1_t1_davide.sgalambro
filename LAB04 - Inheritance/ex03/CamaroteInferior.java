package ex03;

public class CamaroteInferior extends VIP{

    private String localizacao;

    public CamaroteInferior(double valor) {
        super(valor, 0);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeLocalizacao() {
        System.out.println("Localizacao Camarote Inferior : " + localizacao);
    }
}
