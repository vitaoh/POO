package POO2.exercicios.exerciciosA;

import java.nio.file.*;
import java.io.*;

public class Ex6_1 {
    public static void main(String[] args) throws IOException {
        String conteudo1 = Files.readString(Path.of("arquivo1.txt"));
        String conteudo2 = Files.readString(Path.of("arquivo2.txt"));

        int resultado = conteudo1.compareTo(conteudo2);
        if (resultado < 0) {
            System.out.println("arquivo1.txt vem antes lexicograficamente.");
        } else if (resultado > 0) {
            System.out.println("arquivo2.txt vem antes lexicograficamente.");
        } else {
            System.out.println("Os arquivos são iguais.");
        }
    }
}
