package POO2.aulas.lambda;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

public class OperacaoFluxoString {

    public static void main(String[] args) {

        String string[] = {"VERMELHO", "LARANJA", "AMARELO", "VERDE", "AZUL", "VIOLETA"};

        Arrays.stream(string)
                .map((s) -> s.toUpperCase())
                .sorted()
                .forEach((s) -> System.out.print(s + " "));
        System.out.println("");

        List<String> cores = Arrays.stream(string)
                .filter((s) -> s.compareToIgnoreCase("m") < 0)
                .map((s) -> s.toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(cores);

    }
}
