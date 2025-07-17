package POO2.exercicios.exercicio4;

@FunctionalInterface
interface verficarPrimo {

    boolean verificar(int n);
}

public class Primo {

    public static void main(String[] args) {

        verficarPrimo ehPrimo = (n) -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        int count = 0;
        System.out.println("Números primos: ");

        for (int i = 0; i < 200; i++) {
            if (ehPrimo.verificar(i)) {
                System.out.printf("%4d", i);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }

        System.out.println("");
    }
}
