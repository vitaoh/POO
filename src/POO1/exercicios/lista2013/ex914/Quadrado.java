package POO1.exercicios.lista2013.ex914;

public class Quadrado implements ObjetoGeometrico{
    
    private Ponto2D posicaoInfEsq;
    private Ponto2D posicaoSupDir;

    public Quadrado(Ponto2D posicaoInfEsq, Ponto2D posicaoSupDir) {
        setPosicaoInfEsq(posicaoInfEsq);
        setPosicaoSupDir(posicaoSupDir);
    }

    public Ponto2D getPosicaoInfEsq() {
        return posicaoInfEsq;
    }

    public void setPosicaoInfEsq(Ponto2D posicaoInfEsq) {
        this.posicaoInfEsq = posicaoInfEsq;
    }

    public Ponto2D getPosicaoSupDir() {
        return posicaoSupDir;
    }

    public void setPosicaoSupDir(Ponto2D posicaoSupDir) {
        this.posicaoSupDir = posicaoSupDir;
    }

    public double calcularLado() {
        return Math.abs(posicaoInfEsq.getX() - posicaoSupDir.getX());
    }

    @Override
    public double calcularPerimetro() {
        return calcularLado() * 4;
    }

    @Override
    public double calcularArea() {
        return calcularLado() * calcularLado();
    }

    @Override
    public String toString() {
        return "Quadrado \nLado: " + calcularLado() + "\nArea: " + calcularArea() + "\nPerimetro: " + calcularPerimetro();
    }

}