package POO1.exercicios.campos2012.cap5.ex11;

import java.util.Scanner;

public class EX11 {
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);

        System.out.println("\nValor do carro: ");
        double valorCarro = console.nextDouble();

        System.out.println("\nA vista 20% de desconto");

        System.out.println("\nQUANTIDADE DE PARCELAS | PERCENTUAL DE ACRESCIMO SOBRE O PREÇO FINAL");
        System.out.println("          6            |                      3%                     ");
        System.out.println("         12            |                      6%                    ");
        System.out.println("         18            |                      9%                    ");
        System.out.println("         24            |                      12%                    ");
        System.out.println("         30            |                      15%                   ");
        System.out.println("         36            |                      18%                   ");
        System.out.println("         42            |                      21%                   ");
        System.out.println("         48            |                      24%                   ");
        System.out.println("         54            |                      27%                   ");
        System.out.println("         60            |                      30%                   \n");
        System.out.println("Digite [1] para o valor à vista ou o [número de parcelas]: ");

        int tipoDaCompra = console.nextInt();
        double valorFinalDoCarro;

        if (tipoDaCompra == 1) {
            valorFinalDoCarro = 0.8 * valorCarro;
        } else {
            int percentualAcrescimo;
            switch (tipoDaCompra) {
                case 6:
                    percentualAcrescimo = 3;
                    break;
                case 12:
                    percentualAcrescimo = 6;
                    break;
                case 18:
                    percentualAcrescimo = 9;
                    break;
                case 24:
                    percentualAcrescimo = 12;
                    break;
                case 30:
                    percentualAcrescimo = 15;
                    break;
                case 36:
                    percentualAcrescimo = 18;
                    break;
                case 42:
                    percentualAcrescimo = 21;
                    break;
                case 48:
                    percentualAcrescimo = 24;
                    break;
                case 54:
                    percentualAcrescimo = 27;
                    break;
                case 60:
                    percentualAcrescimo = 30;
                    break;
                default:
                    System.out.println("Número de parcelas inválido!");
                    console.close();
                    return;
            }
            valorFinalDoCarro = valorCarro * (1 + (percentualAcrescimo / 100.0));
        }

        console.close();

        System.out.printf("\nValor final do carro: R$ %.2f\n", valorFinalDoCarro);
    }
}
