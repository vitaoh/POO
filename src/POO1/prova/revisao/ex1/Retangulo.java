package POO1.prova.revisao.ex1;

public class Retangulo extends ObjetoBidimensional{
    
    public Retangulo(Ponto2D pontoA, Ponto2D pontoB) {
        super(pontoA, pontoB);
    }

    @Override
    public double getSuperficie() {
        double b = Math.abs(getPontoA().getX() - getPontoB().getX());
        double h = Math.abs(getPontoA().getY() - getPontoB().getY());
        
        return b * h;
    }

    @Override
    public String toString() {
        return "Retangulo (área " + getSuperficie() + ")";
    }
    
    
}
