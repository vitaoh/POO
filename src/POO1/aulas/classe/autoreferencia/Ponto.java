package POO1.aulas.classe.autoreferencia;

public class Ponto {
    
    private double x, y;
    
    public void imprimirA(double x, double y) {
        // parâmetros ocultam campos de mesmo nome
        System.out.println("(" + x + ", " + y + ")");
    }
    
    public void imprimirB(double x, double y) {
        // a variavel local "sombreia" o atributo/campo no escopo do método
        // this vai apontar para a varivel de insstancia 
        System.out.println("(" + this.x + ", " + this.y + ")");
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

    

    
    
    
    
    
}
