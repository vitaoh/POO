package POO2.aulas.colecoes.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>();
        
        lista1.add("Amarelo");
        lista1.add("Azul");
        lista1.add("Vermelho");
        lista1.add("Verde");
        
        System.out.println(lista1);
        
        // padrão de design orientado a objeto
        Iterator<String> iterator = lista1.iterator();
        
        while( iterator.hasNext()){
            System.out.println(iterator.next());
//            iterator.remove();
        }
        
        System.out.println(lista1);
        
        System.out.println("---");
        
        // Arraylist é bom, pois tem baixo custo de processamento para fazer um acesso direto
        System.out.println(lista1.get(2)); 
        
        // Arralist desvantagem: alto custo para inserção e remoção em pontos específicos
        lista1.add(1, "Branco");
        System.out.println(lista1);
        
        System.out.println("---");
        
        String[] cores = { "marrom", "roxo", "preto", "laranja"};
        
        List<String> lista2 = new LinkedList<>(Arrays.asList(cores));
        
        System.out.println(lista2);
        
        // aq tem baixo custo
        lista2.add(1, "verde");
        
        System.out.println(lista2);
        
        System.out.println("---");
        
        Collections.sort(lista1);
        
        System.out.println(lista1);
        
        System.out.println(Collections.binarySearch(lista1, "Preto"));
        System.out.println(Collections.binarySearch(lista1, "Vermelho")); // ele retorna o valor que ele esta 
        
        Collections.reverse(lista1);
        System.out.println(lista1);
        
        lista1.add("Azul");
        System.out.println(lista1);
        
        System.out.println(Collections.frequency(lista1, "Azul"));
        System.out.println(Collections.frequency(lista1, "Vermelho"));
        
        Collections.shuffle(lista1); // embaralha a lista
        System.out.println(lista1);
        
        System.out.println(lista2);
        Collections.fill(lista2, "verde");
        System.out.println(lista2);
        
        System.out.println("---");
        
        // não permite que adicione, nem remove elementos
        List<String> listaVis = Collections.unmodifiableList(lista1);
        
        System.out.println(listaVis.get(2));
        
//        listaVis.add("ouro");
//        listaVis.remove("Vermelho");
        
        // listaSinc pode ser passada e alterada em/para multiplas linhas de execucao (Threads) de forma segura
        List<String> listaSinc = Collections.synchronizedList(lista1);
    }
}
