package POO1.aulas.variavel.composta;

public class Ponto {
    
    private double x, y;

    public Ponto(double x, double y) {
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

    @Override
    public String toString() {
        return super.toString() + "\n(" + getX() + ", " + getY() + ")";
    }
    
    
}
