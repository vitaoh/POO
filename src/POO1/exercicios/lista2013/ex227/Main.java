package POO1.exercicios.lista2013.ex227;

public class Main {
    public static void main(String[] args) {
        Ponto2D ponto1 = new Ponto2D(1, 3);
        Ponto2D ponto2 = new Ponto2D(7, 7);

        Retangulo retangulo = new Retangulo(ponto1, ponto2);

        retangulo.imprimirDetalhes();
    }
    
}
