package POO1.exercicios.lista2013.ex914;

public class Ponto2D {
    
    private double x;
    private double y;

    public Ponto2D() {
        this(0, 0);
    }

    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
