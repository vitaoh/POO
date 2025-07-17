package POO2.exercicios.exercicio3;

import java.util.*;

public class ListFilter {

    public static <T extends Comparable<T>> ArrayList<T> filterGreaterOrEqual(List<T> list, T target) {
        ArrayList<T> filteredList = new ArrayList<>();
        
        for (T element : list) {
            // Usa compareTo: retorna >= 0 se element >= target
            if (element.compareTo(target) >= 0) {
                filteredList.add(element);
            }
        }
        
        return filteredList;
    }
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 5, 3, 8, 2, 9, 4, 7, 6);
        Integer alvoNumero = 5;
        
        ArrayList<Integer> numerosFiltrados = filterGreaterOrEqual(numeros, alvoNumero);
        System.out.println("Filtro de números:");
        System.out.println("Lista original: " + numeros);
        System.out.println("Alvo: " + alvoNumero);
        System.out.println("Números >= " + alvoNumero + ": " + numerosFiltrados);
        System.out.println();
        
        List<String> palavras = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig");
        String alvoPalavra = "cherry";
        
        ArrayList<String> palavrasFiltradas = filterGreaterOrEqual(palavras, alvoPalavra);
        System.out.println("Filtro de strings:");
        System.out.println("Lista original: " + palavras);
        System.out.println("Alvo: " + alvoPalavra);
        System.out.println("Palavras >= \"" + alvoPalavra + "\": " + palavrasFiltradas);
        System.out.println();
        
        List<Double> decimais = Arrays.asList(1.5, 3.2, 2.8, 4.1, 1.9, 3.7);
        Double alvoDecimal = 3.0;
        
        ArrayList<Double> decimaisFiltrados = filterGreaterOrEqual(decimais, alvoDecimal);
        System.out.println("Filtro de números decimais:");
        System.out.println("Lista original: " + decimais);
        System.out.println("Alvo: " + alvoDecimal);
        System.out.println("Decimais >= " + alvoDecimal + ": " + decimaisFiltrados);
        System.out.println();
        
        List<Integer> listaVazia = new ArrayList<>();
        ArrayList<Integer> resultadoVazio = filterGreaterOrEqual(listaVazia, 5);
        System.out.println("Teste com lista vazia:");
        System.out.println("Resultado: " + resultadoVazio);
    }
}
