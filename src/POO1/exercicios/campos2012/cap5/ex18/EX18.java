package POO1.exercicios.campos2012.cap5.ex18;

import java.util.Scanner;

public class EX18 {

    public static void main(String[] args) {

        Scanner console;
        console = new Scanner(System.in);

        int idade, menorIdade = 1000, maiorIdade = -1, qtdF200 = 0, idadeMenorSalario = 0;
        char sexo, sexoMenorSalario = '-';
        double salario, contador = 0.0, somaSalario = 0.0, menorSalario = Double.MAX_VALUE;
        boolean coleta = true;

        while (coleta) {

            System.out.println("Informe a Idade: ");
            idade = console.nextInt();

            if (idade < 0) {
                coleta = false;
                
            } else {

                System.out.println("Informe o sexo (M/F): ");
                // obter um char, porque não existe nextChar()
                sexo = console.next().charAt(0);

                System.out.println("Informe o Salário: ");

                salario = console.nextDouble();

                contador++;
                somaSalario += salario;

                if (menorIdade > idade) {
                    menorIdade = idade;

                }
                if (maiorIdade < idade) {
                    maiorIdade = idade;
                }
                if ( ((sexo == 'F') || (sexo =='f')) && (salario <= 200) ) {
                    qtdF200++;
                }
                if ( menorSalario > salario) {
                    menorSalario = salario;
                    
                    sexoMenorSalario = sexo;
                    idadeMenorSalario = idade;
                }
            }
        }
        
        System.out.println("A média dos salários do grupo é: " + (somaSalario / contador));
        System.out.println("A menor idade do grupo é " + menorIdade);
        System.out.println("A maior idade do grupo é " + maiorIdade);
        System.out.println("A quantidade de mulheres com salário até R$ 200,00 é " + qtdF200);
        System.out.println("A idade " + idadeMenorSalario + " e o sexo" + sexoMenorSalario + " possui o menor salário.");

        console.close();
        
    }
}
