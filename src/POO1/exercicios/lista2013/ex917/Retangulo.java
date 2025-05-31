package POO1.exercicios.lista2013.ex917;

import POO1.exercicios.lista2013.ex914.Ponto2D;

public class Retangulo implements ObjetoGeometrico{

    private Ponto2D ponto1;
    private Ponto2D ponto2;

    public Retangulo(Ponto2D ponto1, Ponto2D ponto2) {
        setPonto1(ponto1);
        setPonto2(ponto2);
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
    
    @Override
    public double calcularPerimetro() {
        
        return (Math.abs(ponto1.getX() - ponto2.getX())) * 2 + (Math.abs(ponto1.getY() - ponto2.getY())) * 2;
    }
    
    @Override
    public double calcularArea() {
        
        return (Math.abs(ponto2.getX() - ponto1.getX())) * (Math.abs(ponto2.getY() - ponto1.getY()));
    }

    @Override
    public String toString() {
        return "Retangulo \nArea: " + calcularArea() + "\nPerimetro: " + calcularPerimetro();
    }
    
    // O compilador gera um erro, porque o método toString foi declarado 
    // na interface e deve ser implementado por todas as classes que a implementam.
}
