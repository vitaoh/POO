package POO1.prova.outraRevisao.ex1;

public abstract class FormaBidimensional {
    
    protected String nomeForma;

    public FormaBidimensional(String nomeForma) {
        setNomeForma(nomeForma);
    }

    public String getNomeForma() {
        return nomeForma;
    }

    public void setNomeForma(String nomeForma) {
        this.nomeForma = nomeForma;
    }
    
    
}
