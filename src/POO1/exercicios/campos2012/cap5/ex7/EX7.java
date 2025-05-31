package POO1.exercicios.campos2012.cap5.ex7;


import java.util.Scanner;

public class EX7 {

    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        double qtdDePessoasAnalisadas = 5;
        int acimaDe50anos = 0;
        int entre10a20anos = 0;
        double menosDe40kilos = 0;
        double alturaEntre10a20anos = 0;

        for (int i = 0; i < qtdDePessoasAnalisadas; i++) {

            System.out.println("Idade: ");
            int idade = console.nextInt();
            System.out.println("Peso: ");
            double peso = console.nextDouble();
            System.out.println("Altura: ");
            double altura = console.nextDouble();

            if (idade > 50) {
                acimaDe50anos++;
            }
            if (idade >= 10 && idade <= 20) {
                entre10a20anos++;
                alturaEntre10a20anos += altura;
            }
            if (peso < 40) {
                menosDe40kilos++;
            }

        }

        console.close();

        System.out.println("A quantidade de pessoas com idade superior a 50 anos: " + acimaDe50anos);
        System.out.println("A media das alturas das pessoas com idade entre 10 e 20 anos: " + (alturaEntre10a20anos / entre10a20anos));
        System.out.printf("A porcentagem de pessoas com peso inferior a 40 kg entre todas as pessoas analisadas: %.1f %%\n", ((menosDe40kilos / qtdDePessoasAnalisadas) * 100));
    }
}
