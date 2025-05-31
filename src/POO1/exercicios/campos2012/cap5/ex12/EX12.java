package POO1.exercicios.campos2012.cap5.ex12;

import java.util.Scanner;

public class EX12 {

    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int qtdPrimos = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Numero: ");
            int num = console.nextInt();
            boolean ehPrimo = true;

            if (num <= 1) {
                ehPrimo = false;
            } else {
                for (int j = 2; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                qtdPrimos++;
            }
        }

        console.close();
        System.out.println("Quantidade de numeros primos: " + qtdPrimos);
    }
}
