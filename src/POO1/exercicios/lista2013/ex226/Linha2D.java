package POO1.exercicios.lista2013.ex226;

public class Linha2D {

    private Ponto2D ponto1;
    private Ponto2D ponto2;

    public Linha2D(Ponto2D ponto1, Ponto2D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }

    public Ponto2D getPonto1() {
        return ponto1;
    }

    public void setPonto1(Ponto2D ponto1) {
        this.ponto1 = ponto1;
    }

    public Ponto2D getPonto2() {
        return ponto2;
    }

    public void setPonto2(Ponto2D ponto2) {
        this.ponto2 = ponto2;
    }

    public double comprimentoLinha() {
        double deltaX = Math.abs(ponto1.getX() - ponto2.getX());
        double deltaY = Math.abs(ponto1.getY() - ponto2.getY());
        return Math.sqrt( deltaX * deltaX + deltaY * deltaY);
    }

    public void imprimirDetalhes() {
        System.out.println("Comprimento linha: " + comprimentoLinha());
    }

    
}
