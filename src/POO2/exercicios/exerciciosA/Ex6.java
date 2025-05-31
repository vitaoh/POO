package POO2.exercicios.exerciciosA;

import java.util.*;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();
        System.out.println("Digite números inteiros (0 para parar):");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) break;
            if (!numeros.add(num)) {
                throw new IllegalArgumentException("Número duplicado encontrado: " + num);
            }
        }
    }
}

