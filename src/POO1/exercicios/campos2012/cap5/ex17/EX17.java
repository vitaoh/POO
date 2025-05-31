package POO1.exercicios.campos2012.cap5.ex17;

import java.util.Scanner;

public class EX17 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        boolean continuar = true;

        int audiencia1 = 0;
        int audiencia4 = 0;
        int audiencia5 = 0;
        int audiencia7 = 0;

        System.out.println("Digite no canal o numero zero para parar!");

        while (continuar) { 
            System.out.println("Canal [1] | [4] | [5] | [7] : ");
            int canal = console.nextInt();
            System.out.println("Quantidade de pessoas que assistem o canal: ");
            int qtdDePessoas = console.nextInt();
                while (qtdDePessoas < 0) {
                    System.out.println("Digito errado!");
                    System.out.println("Quantidade de pessoas que assistem o canal: ");
                    qtdDePessoas = console.nextInt();
                }

            switch (canal) {
                default:
                    System.out.println("Digito errado!");
                    while (canal != 1 && canal != 4 && canal != 5 && canal != 7) { 
                        System.out.println("Tente novamente!");
                        System.out.println("Canal [1] | [4] | [5] | [7] : ");
                        canal = console.nextInt();
                    }
                    
                case 1:
                    audiencia1 += qtdDePessoas;
                    break;
                case 4:
                    audiencia4 += qtdDePessoas;
                    break;
                case 5:
                    audiencia5 += qtdDePessoas;
                    break;
                case 7:
                    audiencia7 += qtdDePessoas;
                case 0:
                    continuar = false;
                    break;
            }

            System.out.println("Cadastrado!");

        }


        console.close();

        System.out.println("Audiencia canal 1: " + audiencia1);
        System.out.println("Audiencia canal 4: " + audiencia4);
        System.out.println("Audiencia canal 5: " + audiencia5);
        System.out.println("Audiencia canal 7: " + audiencia7);

    }
}
