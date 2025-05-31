package POO1.exercicios.lista2013.ex914;

public class Main {
    public static void main(String[] args) {
        
        Ponto2D ponto1 = new Ponto2D(1, 1);
        Ponto2D ponto2 = new Ponto2D(5, 5);

        Quadrado quadrado = new Quadrado(ponto1, ponto2);
        
        System.out.println(quadrado);
    }
}
