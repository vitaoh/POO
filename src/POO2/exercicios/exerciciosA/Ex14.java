package POO2.exercicios.exerciciosA;

import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Ex14 {
    public static void main(String[] args) throws IOException {
        List<String> linhas = Files.readAllLines(Path.of("texto.txt"));
        String[] array = linhas.toArray(new String[0]);

        for (String linha : array) {
            System.out.println(linha);
        }
    }
}
