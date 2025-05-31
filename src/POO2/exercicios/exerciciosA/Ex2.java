package POO2.exercicios.exerciciosA;

public class Ex2 {
    public static void verificarPar(int numero) {
        if (numero % 2 != 0) {
            throw new IllegalArgumentException("Número ímpar fornecido.");
        }
    }

    public static void main(String[] args) {
        verificarPar(4);
        verificarPar(5);
    }
}

