
package POO1.aulas.math;

// todas as classes existentes no pacote lang são inluídas por padrão
// import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        
        // a classe Math é estática (static) não precisa de instância para executar
        // métodos e acessar constantes
        double numero = Math.PI;
        System.out.println(numero);
        
        numero = -2.0;
        numero = Math.abs(numero);
        System.out.println(numero);
        
        numero = Math.sqrt(36);
        System.out.println(numero);
        
        numero = Math.pow(2, 3);
        System.out.println(numero);
        
        numero = Math.pow(36.0, 1.0 / 2.0);
        System.out.println(numero);
        
        numero = Math.exp(1.0);
        System.out.println(numero);
        
        System.out.println( numero == Math.E );
        
    }
}
