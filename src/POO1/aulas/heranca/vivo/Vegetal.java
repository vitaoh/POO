package POO1.aulas.heranca.vivo;

public class Vegetal extends SerVivo{

    private String localizacao;
    
    public Vegetal(String localizacao) {
        super(false);
        setLocalizacao(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    @Override 
    protected String definicao() {
        return "È um vegetal. " + super.definicao();
    }
    
}
