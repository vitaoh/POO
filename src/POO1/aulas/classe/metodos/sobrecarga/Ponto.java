package POO1.aulas.classe.metodos.sobrecarga;

public class Ponto {

    private double x, y;
    private boolean xPositivo, yPositivo;

    // exemplos de sobrecarga de construtor
    public Ponto(String coordenada, double v) {

        if (coordenada.equals("x")) {
            setX(v);
            setY(0.0);
        } else if (coordenada.equals("y")) {
            setX(0.0);
            setY(v);
        } else {
            setX(0.0);
            setY(0.0);
        }

    }

    public Ponto() {
        //setX(0.0);
        //setY(0.0);
        this(0.0, 0.0); // irá chamar o construtor assinado com dois parametros double
    }

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

    public void setX() {
        setX(0.0);
    }

    public void setY(double y) {
        this.y = y;
        setYPositivo(0 <= y);
    }
    
    public void setY() {
        setY(0.0);
    }

    private void setXPositivo(boolean xPositivo) {
        this.xPositivo = xPositivo;
    }

    private void setYPositivo(boolean yPositivo) {
        this.yPositivo = yPositivo;
    }

}
