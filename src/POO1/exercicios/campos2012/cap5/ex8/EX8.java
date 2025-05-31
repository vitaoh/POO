package POO1.exercicios.campos2012.cap5.ex8;


import java.util.Scanner;

public class EX8 {

    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int qtdDePessoas = 6;
        int acimaDe50anosInferiorA60kilos = 0;
        int inferiorA1e50metros = 0;
        int idadesDasInferiorA1e50metros = 0;
        int corAzul = 0;
        int ruivosNaoAzul = 0;

        for (int i = 0; i < qtdDePessoas; i++) {
            System.out.println("Idade: ");
            int idade = console.nextInt();
            System.out.println("Peso: ");
            double peso = console.nextDouble();
            System.out.println("Altura em metros: ");
            double altura = console.nextDouble();
            System.out.println("Cor dos Olhos [A] azul; [P] preto; [V] verde; [C] castanho: ");
            char corOlhos = console.next().charAt(0);
            System.out.println("Cor do cabelo [P] preto; [C] castanho; [L] louro; [R] ruivo: ");
            char corCabelo = console.next().charAt(0);

            if (idade > 50 && peso < 60) {
                acimaDe50anosInferiorA60kilos++;
            }
            if (altura < 1.5) {
                inferiorA1e50metros++;
                idadesDasInferiorA1e50metros += idade;
            }
            if (corOlhos == 'A' || corOlhos == 'a') {
                corAzul++;
            } else if (corCabelo == 'R' || corCabelo == 'r') {
                ruivosNaoAzul++;
            }
        }

        console.close();

        double medIdadeAlturaInferiorA1e50 = (inferiorA1e50metros > 0) ? ((double) idadesDasInferiorA1e50metros / inferiorA1e50metros) : (0);

        double porCentagemDeOLhosAzuis = ((double) corAzul / qtdDePessoas) * 100;

        System.out.println("A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 kg: " + acimaDe50anosInferiorA60kilos);
        System.out.println("A média das idades das pessoas com altura inferior a 1,50 m: " + medIdadeAlturaInferiorA1e50);
        System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas: " + porCentagemDeOLhosAzuis + "%");
        System.out.println("A quantidade de pessoas ruivas e que não possuem olhos azuis: " + ruivosNaoAzul + "\n");
    }
}
