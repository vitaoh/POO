package POO1.exercicios.campos2012.cap5.ex9;

import java.util.Scanner;

public class EX9 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int qtdDePessoas = 10;
        int idadeTotal = 0;
        int pesoAcimaDe90inferiorA1e50metros = 0;
        int de10a30anosMaisDe1e90 = 0;
        int maisDe1e90 = 0;

        for (int i = 0; i < qtdDePessoas; i++) {

            System.out.println("Idade: ");
            int idade = console.nextInt();
            System.out.println("Peso: ");
            double peso = console.nextDouble();
            System.out.println("Altura: ");
            double altura = console.nextDouble();

            idadeTotal += idade;
            if (peso > 90 && altura < 1.5) {
                pesoAcimaDe90inferiorA1e50metros++;
            }
            if (altura > 1.9) {
                maisDe1e90++;
                if (idade >= 10 && idade <= 30) {
                    de10a30anosMaisDe1e90++;
                }
            }
        }

        console.close();

        System.out.println("A media das idades das dez pessoas: " + (double) (idadeTotal / qtdDePessoas));
        System.out.println("A quantidade de pessoas com peso superior a 90 kg e altura inferior a 1,50 metro: " + pesoAcimaDe90inferiorA1e50metros);
        System.out.println("A porcentagem de pessoas com idade entre 10 e 30 anos entre as pessoas que medem mais de 1,90 m: " + ((maisDe1e90 > 0) ? (double) ((de10a30anosMaisDe1e90 / maisDe1e90) * 100) : 0));
    }
}
