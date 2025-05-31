package POO1.exercicios.campos2012.cap5.ex14;

import java.util.Scanner;

public class EX14 {

    public static void main(String[] args) {

        int qtdDoPublico = 15;
        int qtdDeOtimo = 0;
        int idadeTotalOtimo = 0;
        int qtdDeRegular = 0;
        int qtdDeBom = 0;

        Scanner console = new Scanner(System.in);

        for (int i = 0; i < qtdDoPublico; i++) {

            int opiniao;
            int idade;

            System.out.println("Idade: ");
            idade = console.nextInt();
            System.out.println("Opiniao [3] ótimo, [2] bom, [1] regular: ");
            opiniao = console.nextInt();

            switch (opiniao) {
                case 1:
                    qtdDeRegular++;
                    break;
                case 2:
                    qtdDeBom++;
                    break;
                case 3:
                    qtdDeOtimo++;
                    idadeTotalOtimo += idade;
                    break;
                default:
                    System.out.println("Digito Errado, tente novamente!");
                    i--;
                    continue;
            }
        }

        console.close();

        double pCentagemDeBOm = ((double) (qtdDeBom / qtdDoPublico)) * 100;

        System.out.println("A media das idades das pessoas que responderam otimo: " + (double) (idadeTotalOtimo / qtdDeOtimo));
        System.out.println("A quantidade de pessoas que responderam regular: " + qtdDeRegular);
        System.out.println("A percentagem de pessoas que responderam bom: " + pCentagemDeBOm + "%");
    }
}
