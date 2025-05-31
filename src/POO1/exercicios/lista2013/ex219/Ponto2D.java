package POO1.exercicios.lista2013.ex219;

public class Ponto2D {

    private double x;
    private double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void mover(double deltaX, double deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    public double calcularDistancia(Ponto2D outroPonto) {
        double dx = outroPonto.getX() - this.x;
        double dy = outroPonto.getY() - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "Ponto2D(" + x + ", " + y + ")";
    }

}
