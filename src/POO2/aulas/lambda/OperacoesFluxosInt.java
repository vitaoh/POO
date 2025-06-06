package POO2.aulas.lambda;

import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class OperacoesFluxosInt {

    public static void main(String[] args) {
        int vetor[] = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};

        // opercao terminais
        System.out.println("Vetor:");
        IntStream.of(vetor).forEach((i) -> System.out.print(i + " "));
        System.out.println("\n");

        System.out.println("Pares:");
        IntStream.of(vetor).forEach((i) -> {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        });
        System.out.println("\n");

        System.out.println("Operações:");
        int max = IntStream.of(vetor).max().getAsInt();
        int min = IntStream.of(vetor).min().getAsInt();
        int soma = IntStream.of(vetor).sum();
        double media = IntStream.of(vetor).average().getAsDouble();

        System.out.printf("max = %d \nmin = %d \nsoma = %d \nmedia = %.2f \n\n", max, min, soma, media);

        int somatorio = IntStream.of(vetor).reduce(0, (x, y) -> x + y);
        System.out.println("Somatorio:");
        System.out.println(somatorio + "\n");

        System.out.println("Produtorio:");
        int produtorio = IntStream.of(vetor).reduce(1, (x, y) -> x * y);
        System.out.println(produtorio + "\n");

        // operações intermediárias
        int somatorioPares = IntStream.of(vetor).filter(i -> i % 2 == 0).reduce(0, (x, y) -> x + y);
        System.out.println("Somatorio Pares:");
        System.out.println(somatorioPares + "\n");

        System.out.println("Impares Filtrados Ordenados:");
        IntStream.of(vetor).filter(i -> i % 2 != 0).sorted().forEach((i) -> System.out.print(i + " "));
        System.out.println("\n");

        System.out.println("Impares Dobrados Ordenados:");
        IntStream.of(vetor).filter(i -> i % 2 != 0).map((i) -> i * 2).sorted().forEach((i) -> System.out.print(i + " "));
        System.out.println("\n");

        Integer array[] = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        List imparesDobrados
                = Arrays.stream(array)
                        .filter(i -> i % 2 != 0)
                        .map((i) -> i * 2)
                        .sorted()
                        .collect(Collectors.toList());
        System.out.println("Impares dobrados ordenados" + imparesDobrados);
    }
}
