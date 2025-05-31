package POO1.aulas.classe.metodos.predicados;

public class Ponto {
    
    private double x, y; 
    private boolean xPositivo, yPositivo;

    public Ponto(double x, double y) {
        setX(x);
        setY(y);
    }    

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // metodo predicado é um "get" para campo boleano, onde se utiliza "is" e não "get"
    public boolean isXPositivo() {
        return xPositivo;
    }

    public boolean isYPositivo() {
        return yPositivo;
    }

    public void setX(double x) {
        this.x = x;
        setXPositivo(0 <= x);
    }

    public void setY(double y) {
        this.y = y;
        setYPositivo(0 <= y);
    }

    private void setXPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    private void setYPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }
    
    
}
