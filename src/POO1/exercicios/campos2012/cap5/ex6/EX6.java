package POO1.exercicios.campos2012.cap5.ex6;


import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        double totalPrazo = 0.0;
        double totalAvista = 0.0;

        for (int i = 0; i < 5; i++) {
            double valor;
            System.out.println("Codigo [P] para prazo e [V] para a vista: ");
            char codigo = console.next().charAt(0);
            if (codigo != 'V' && codigo != 'v' && codigo != 'p' && codigo != 'P') {
                System.out.println("Codigo errado!");
                i--;
                continue;
            } else {
                System.out.println("Valor: ");
                if (codigo == 'V' || codigo == 'v') {
                    valor = console.nextDouble();
                    totalAvista += valor;
                } else {
                    valor = console.nextDouble();
                    totalPrazo += valor;
                }
            }
        }
        System.out.println("");
        console.close();
        System.out.printf("Total das compras a vista: R$ %.2f\n", totalAvista);
        System.out.printf("Total das compras a prazo: R$ %.2f\n", totalPrazo);
        System.out.printf("Total das compras efetuadas: R$ %.2f\n", totalPrazo + totalAvista);
        System.out.printf("Valor da primeira prestaçao das compras a prazo: R$ %.2f\n", totalPrazo / 3);

    }
}
