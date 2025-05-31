package POO2.exercicios.exerciciosA;

public class Ex26 {
    public static boolean isHexadecimal(String str) {
        return str.matches("(?i)^[0-9a-f]+$");
    }

    public static void main(String[] args) {
        System.out.println(isHexadecimal("1A3F"));  
        System.out.println(isHexadecimal("G123")); 
    }
}
