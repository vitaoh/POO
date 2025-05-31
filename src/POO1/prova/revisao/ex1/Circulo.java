package POO1.prova.revisao.ex1;

public class Circulo extends ObjetoBidimensional{

    public Circulo(Ponto2D pontoA, Ponto2D pontoB) {
        super(pontoA, pontoB);
    }   

    @Override
    public double getSuperficie() {
        double raio = getPontoA().distP(getPontoB()) / 2.0;

        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo (area " + getSuperficie() + ")";
    }


}
