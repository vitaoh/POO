package POO1.exercicios.lista2013.ex227;

public class Retangulo {

    private Ponto2D ponto1;
    private Ponto2D ponto2;

    public Retangulo(Ponto2D ponto1, Ponto2D ponto2) {
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

    public double alturaRetangulo() {
        return Math.abs(ponto2.getY() - ponto1.getY());
    }

    public double larguraRetangulo() {
        return Math.abs(ponto2.getX() - ponto1.getX());
    }

    public double areaRetangulo() {
        return alturaRetangulo() * larguraRetangulo();
    }

    public void imprimirDetalhes() {
        System.out.println("Altura: " + alturaRetangulo());
        System.out.println("Largura: " + larguraRetangulo());
        System.out.println("Area: " + areaRetangulo());
    }
}
