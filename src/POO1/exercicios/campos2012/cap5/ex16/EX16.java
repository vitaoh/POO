package POO1.exercicios.campos2012.cap5.ex16;

import java.util.Scanner;


public class EX16 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

        int idadeTotal = 0;
        int qtdDePessoas = 0;

        System.out.println("\nDigite um numero negativo ou zero para parar!");

        while (true) {
            System.out.println("Idade: ");
            int idade = console.nextInt();

            if (idade <= 0) {
                console.close();
                System.out.printf("\nMedia das idades: %.2f\n", (qtdDePessoas == 0 ? 0 :  (double) idadeTotal / qtdDePessoas));
                return;
            }

            idadeTotal += idade;
            qtdDePessoas++;
        }
        
    }
}
