package POO2.exercicios.exercicio3;

import java.util.*;

public class ListMerger {
    
    public static <T> List<T> mergeAlternating(List<T> list1, List<T> list2) {
        List<T> mergedList = new ArrayList<>();
        
        int maxSize = Math.max(list1.size(), list2.size());
        
        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                mergedList.add(list1.get(i));
            }
            
            if (i < list2.size()) {
                mergedList.add(list2.get(i));
            }
        }
        
        return mergedList;
    }
    
    public static void main(String[] args) {
        List<String> nomes1 = Arrays.asList("Ana", "Carlos", "Elena");
        List<String> nomes2 = Arrays.asList("Bruno", "Diana", "Felipe", "Gabriela");
        
        List<String> nomesMesclados = mergeAlternating(nomes1, nomes2);
        System.out.println("Listas de nomes mescladas:");
        System.out.println("Lista 1: " + nomes1);
        System.out.println("Lista 2: " + nomes2);
        System.out.println("Resultado: " + nomesMesclados);
        System.out.println();
        
        List<Integer> numeros1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> numeros2 = Arrays.asList(2, 4, 6);
        
        List<Integer> numerosMesclados = mergeAlternating(numeros1, numeros2);
        System.out.println("Listas de números mescladas:");
        System.out.println("Lista 1: " + numeros1);
        System.out.println("Lista 2: " + numeros2);
        System.out.println("Resultado: " + numerosMesclados);
        System.out.println();
        
        List<String> listaVazia = new ArrayList<>();
        List<String> listaNaoVazia = Arrays.asList("A", "B", "C");
        
        List<String> resultadoComVazia = mergeAlternating(listaVazia, listaNaoVazia);
        System.out.println("Teste com lista vazia:");
        System.out.println("Lista vazia: " + listaVazia);
        System.out.println("Lista não vazia: " + listaNaoVazia);
        System.out.println("Resultado: " + resultadoComVazia);
    }
}
