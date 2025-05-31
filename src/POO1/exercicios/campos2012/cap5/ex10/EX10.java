package POO1.exercicios.campos2012.cap5.ex10;


import java.util.Scanner;

public class EX10 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int qtdDeNumeros = 10;
        int somaNumPares = 0;
        int somaNumPrimos = 0;

        for (int i = 0; i < qtdDeNumeros; i++) {

            System.out.println("Numero: ");
            int num = console.nextInt();

            if (num <= 1) {
                continue;
            }

            if (num % 2 == 0) {
                somaNumPares += num;
            }

            boolean ehPrimo = true;

            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                somaNumPrimos += num;
            }

        }

        console.close();

        System.out.println("Soma dos numeros pares: " + somaNumPares);
        System.out.println("Soma dos numeros primos: " + somaNumPrimos);

    }
}
