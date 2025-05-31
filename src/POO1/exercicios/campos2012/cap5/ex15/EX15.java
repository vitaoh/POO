package POO1.exercicios.campos2012.cap5.ex15;

import java.util.Scanner;

public class EX15 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int qtdDeEntrevistados = 4;
        int numeroDeSim = 0;
        int numeroDeNao = 0;
        int mulheresSim = 0;
        int numeroDeHomens = 0;
        int homensNao = 0;

        for (int i = 0; i < qtdDeEntrevistados; i++) {

            System.out.println("Sexo 'M' ou 'F': ");
            char sexo = console.next().charAt(0);
            System.out.println("Gostaram do produto 'S' ou 'N': ");
            char resposta = console.next().charAt(0);

            if (resposta == 'S' || resposta == 's') {
                numeroDeSim++;
                if (sexo == 'F' || sexo == 'f') {
                    mulheresSim++;
                }
            } else if (resposta == 'N' || resposta == 'n') {
                numeroDeNao++;
                if (sexo == 'M' || sexo == 'm') {
                    homensNao++;
                }
            } else {
                System.out.println("Digito errado!");
                i--;
                continue;
            }

            if (sexo == 'M' || sexo == 'm') {
                numeroDeHomens++;
            }


        }

        console.close();

        System.out.println("O numero de pessoas que responderam sim: " + numeroDeSim);
        System.out.println("O numero de pessoas que responderam nao: " + numeroDeNao);
        System.out.println("O numero de mulheres que responderam sim: " + mulheresSim);
        System.out.println("A percentagem de homens que responderam nao, entre todos os homens: " + ( numeroDeHomens > 0 ? (((double)homensNao/numeroDeHomens) * 100) : 0) + "%");
    }
}
