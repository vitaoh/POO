package POO2.exercicios.exerciciosA;

public class Ex7 {
    public static void verificarVogais(String texto) {
        if (!texto.matches(".*[aeiouAEIOU].*")) {
            throw new IllegalArgumentException("String não contém vogais.");
        }
    }

    public static void main(String[] args) {
        verificarVogais("xyz");
        verificarVogais("Java");
    }
}

