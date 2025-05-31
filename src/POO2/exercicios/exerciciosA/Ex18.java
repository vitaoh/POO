package POO2.exercicios.exerciciosA;

import java.nio.file.*;
import java.io.*;

public class Ex18 {
    public static void main(String[] args) throws IOException {
        String texto = Files.readString(Path.of("texto.txt"));
        String[] palavras = texto.split("\\W+");
        String maior = "";

        for (String p : palavras) {
            if (p.length() > maior.length()) {
                maior = p;
            }
        }
        System.out.println("Palavra mais longa: " + maior);
    }
}
