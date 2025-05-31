package POO1.exercicios.lista2013.ex914;

public class Trapezio implements ObjetoGeometrico {
    
    private Ponto2D pontoInfEsq;
    private Ponto2D pontoInfDir;
    private Ponto2D pontoSupEsq;
    private Ponto2D pontoSupDir;

    public Trapezio(Ponto2D pontoInfEsq, Ponto2D pontoInfDir, Ponto2D pontoSupEsq, Ponto2D pontoSupDir) {
        setPontoInfDir(pontoInfDir);
        setPontoInfEsq(pontoInfEsq);
        setPontoSupDir(pontoSupDir);
        setPontoSupEsq(pontoSupEsq);
    }

    public Ponto2D getPontoInfEsq() {
        return pontoInfEsq;
    }

    public void setPontoInfEsq(Ponto2D pontoInfEsq) {
        this.pontoInfEsq = pontoInfEsq;
    }

    public Ponto2D getPontoInfDir() {
        return pontoInfDir;
    }

    public void setPontoInfDir(Ponto2D pontoInfDir) {
        this.pontoInfDir = pontoInfDir;
    }

    public Ponto2D getPontoSupEsq() {
        return pontoSupEsq;
    }

    public void setPontoSupEsq(Ponto2D pontoSupEsq) {
        this.pontoSupEsq = pontoSupEsq;
    }

    public Ponto2D getPontoSupDir() {
        return pontoSupDir;
    }

    public void setPontoSupDir(Ponto2D pontoSupDir) {
        this.pontoSupDir = pontoSupDir;
    }

    private double calcularDistancia(Ponto2D p1, Ponto2D p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    private double calcularAltura() {
        return Math.abs(pontoSupEsq.getY() - pontoInfEsq.getY());
    }

    @Override
    public double calcularArea() {
        double baseMaior = calcularDistancia(pontoInfEsq, pontoInfDir);
        double baseMenor = calcularDistancia(pontoSupEsq, pontoSupDir);
        double altura = calcularAltura();
        return (baseMaior + baseMenor) * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        double lado1 = calcularDistancia(pontoInfEsq, pontoSupEsq);
        double lado2 = calcularDistancia(pontoInfDir, pontoSupDir);
        double baseMaior = calcularDistancia(pontoInfEsq, pontoInfDir);
        double baseMenor = calcularDistancia(pontoSupEsq, pontoSupDir);
        return lado1 + lado2 + baseMaior + baseMenor;
    }

    @Override
    public String toString() {
        return "Trapezio: " +
               "\n  Ponto Inferior Esquerdo: " + pontoInfEsq +
               "\n  Ponto Inferior Direito: " + pontoInfDir +
               "\n  Ponto Superior Esquerdo: " + pontoSupEsq +
               "\n  Ponto Superior Direito: " + pontoSupDir +
               "\n  Área: " + calcularArea() +
               "\n  Perímetro: " + calcularPerimetro();
    }
}
