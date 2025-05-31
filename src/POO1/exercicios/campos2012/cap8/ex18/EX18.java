package POO1.exercicios.campos2012.cap8.ex18;

public class EX18 {

    public static void main(String[] args) {
        int primosAcimaDe100 = 0;
        int numTeste = 100;

        while (primosAcimaDe100 < 3) {
            numTeste++;
            boolean ehPrimo = true;

            for (int i = 2; i <= Math.sqrt(numTeste); i++) {
                if (numTeste % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(numTeste + " é primo");
                primosAcimaDe100++;
            }
        }
    }
}
