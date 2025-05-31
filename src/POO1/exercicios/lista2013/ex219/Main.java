package POO1.exercicios.lista2013.ex219;

public class Main {

    public static void main(String[] args) {

        Ponto2D ponto1 = new Ponto2D(2.0, 3.0);
        Ponto2D ponto2 = new Ponto2D(5.0, 7.0);

        System.out.println("Ponto 1: " + ponto1);
        System.out.println("Ponto 2: " + ponto2);

        double distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Distância entre Ponto 1 e Ponto 2: " + distancia);

        ponto1.mover(3.0, -1.0);
        System.out.println("Ponto 1 após mover: " + ponto1);

        distancia = ponto1.calcularDistancia(ponto2);
        System.out.println("Nova distância entre Ponto 1 e Ponto 2: " + distancia);
    }
}
