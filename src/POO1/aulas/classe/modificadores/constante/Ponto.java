package POO1.aulas.classe.modificadores.constante;

public class Ponto {
    
    private final String nome; // constante
    private double x, y; 

    public Ponto(double x, double y, String nome) {
        setX(x);
        setY(y);
        this.nome = nome;
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
    
    public String getNome() {
        return nome;
    }
    
}
