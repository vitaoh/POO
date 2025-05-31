package POO2.exercicios.exerciciosA;

import java.util.regex.*;

public class Ex4 {
    public static void main(String[] args) {
        String texto = "Hoje fui à Praia e vi o Sol.";
        Pattern p = Pattern.compile("\\b[A-Z][a-z]+\\b");
        Matcher m = p.matcher(texto);

        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
