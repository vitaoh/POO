package POO1.aulas.associacao.composicao;

public class Carro {
    
    private Roda diantEsq;
    private Roda diantDir;
    private Roda trasEsq;
    private Roda trasDir;
    
    public Carro() {
        
        diantEsq = new Roda();
        diantDir = new Roda();
        trasEsq = new Roda();
        trasDir = new Roda();
        
    }
    
    public Roda getDiantEsq() {
        return diantEsq;
    }
    
    public Roda getDiantDir() {
        return diantDir;
    }
    
    public Roda getTrasEsq() {
        return trasEsq;
    }
    
    public Roda getTrasDir() {
        return trasDir;
    }
    
    private void setDiantEsq(Roda r) {
        diantEsq = r;
    }
    
    private void setDiantDir(Roda r) {
        diantDir = r;
    }
    
    private void setTrasEsq(Roda r) {
        trasEsq = r;
    }
    
    private void setTrasDir(Roda r) {
        trasDir = r;
    }
    
    public void trocarRodaDiantEsq() {
        Roda aux = new Roda();
        setDiantEsq(aux);
    }
    
    
    
}
