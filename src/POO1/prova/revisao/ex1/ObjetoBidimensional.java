package POO1.prova.revisao.ex1;

import POO1.prova.revisao.ex1.Ponto2D;

public class ObjetoBidimensional implements GeometriaBidimensional{
    
    private Ponto2D pontoA, pontoB;

    public ObjetoBidimensional(Ponto2D pontoA, Ponto2D pontoB) {
        setPontoA(pontoA);
        setPontoB(pontoB);
    }

    public Ponto2D getPontoA() {
        return pontoA;
    }

    public void setPontoA(Ponto2D pontoA) {
        if (pontoA != null) {
            this.pontoA = pontoA;
        }
    }

    public Ponto2D getPontoB() {
        return pontoB;
    }

    public void setPontoB(Ponto2D pontoB) {
        if (pontoB != null) {
            this.pontoB = pontoB;   
        }
    }

    @Override
    public Ponto2D getCentro() {
        return pontoA.getPontoMedio(pontoB);
    }

    @Override
    public double getSuperficie() {
        return Math.abs(pontoB.getX() - pontoA.getX()) * Math.abs(pontoB.getY() - pontoA.getY());
    }
    
    
}
