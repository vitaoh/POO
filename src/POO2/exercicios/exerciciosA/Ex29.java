package POO2.exercicios.exerciciosA;


public class Ex29 {
    public static boolean isExpressaoMatematica(String str) {
        return str.matches("[0-9+\\-*/().\\s]+");
    }

    public static void main(String[] args) {
        System.out.println(isExpressaoMatematica("2 + 3 * (7 - 4)"));
        System.out.println(isExpressaoMatematica("abc + 5"));
    }
}
