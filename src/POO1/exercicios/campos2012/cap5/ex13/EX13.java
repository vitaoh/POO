package POO1.exercicios.campos2012.cap5.ex13;

import java.util.Scanner;

public class EX13 {

    public static void main(String[] args) {
        Scanner console;
        console = new Scanner(System.in);
        int idade, p1 = 0, p2 = 0, p3 = 0, p4 = 0;
        double peso, pFE1 = 0.0, pFE2 = 0.0, pFE3 = 0.0, pFE4 = 0.0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Idade: ");
            idade = console.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("Idade incorreta!\nTente novamente!");
                i--;
                continue;
            } else {
                System.out.println("Peso: ");
                peso = console.nextInt();
                if (idade > 0 && idade <= 10) {
                    pFE1 += peso;
                    p1++;
                } else if (idade > 10 && idade <= 20) {
                    pFE2 += peso;
                    p2++;
                } else if (idade > 20 && idade <= 30) {
                    pFE3 += peso;
                    p3++;
                } else if (idade > 30 && idade <= 150) {
                    pFE4 += peso;
                    p4++;
                } else {
                    System.out.println("Peso invalido!");
                    System.out.println("Tente novamente!");
                    i--;
                    continue;
                }
            }
        }
        console.close();
        System.out.println("Media da Primeira Faixa Etaria: " + (pFE1 / p1));
        System.out.println("Media da Segunda Faixa Etaria: " + (pFE2 / p2));
        System.out.println("Media da Terceira Faixa Etaria: " + (pFE3 / p3));
        System.out.println("Media da Quarta Faixa Etaria: " + (pFE4 / p4));

    }

}
