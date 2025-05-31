package POO1.aulas.heranca.object;

// Toda classe java herda diretamenta ou indiretamente da classe Object.

// Object é superclasse.
// Ponto é subclasse.

// Ponto herda os recursos (atributos e métodos) da classe Object.

// Ponto "é um" (relacionamento) Object.

public class Ponto { // está implícito a instrução "extends Object {"
    
    private double x;
    protected double y; // todas as classes do mesmo java package tem acesso.

    public Ponto() {
        setX(0.0);
        setY(0.0);
    }
    
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
        String resultado;
        resultado = "O ponto é (" + getX() + ", " + getY() +")";
        
        String aux = super.toString();
        System.out.println(aux);
        
        int indice = aux.lastIndexOf("@") + 1;
        
        String endereco = aux.substring(indice);
        
        resultado += ", e o objeto se encontra na posição de memória da JVm: " + endereco;
        return resultado;
    }
}
