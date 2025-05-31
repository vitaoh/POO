package POO1.aulas.colecoes.arraylist;

import java.util.ArrayList;
import POO1.aulas.variavel.composta.Ponto;

public class Main {
    public static void main(String[] args) {
        
//      ArrayList lista = new ArrayList();
        ArrayList<Object> lista = new ArrayList(); // está implícito o uso do genérico Object (linha 9)

        lista.add(13); // 0
        lista.add(3); // 1
        lista.add(1); // 2
        lista.add(2); // 3
        lista.add(-1); // 4
        
        System.out.println(lista.get(2));
        System.out.println(lista.contains(51));
        System.out.println(lista.contains(2));
        System.out.println(lista.size());
        
        System.out.println("\n---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        lista.set(1, 1951);
        System.out.println("\n---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        lista.remove(2); // remove o elemento do indice 2
        System.out.println("\n---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        
        int k = lista.indexOf(2);
        lista.remove(k); // remover onde se encontra o elemento 2
        
        
        ArrayList<Ponto> pontos = new ArrayList<>();
        pontos.add(new Ponto(5, 16.7));
        pontos.add(new Ponto(1.2, 6.5));
        pontos.add(new Ponto(0, 17));
        
        for (int i = 0; i < pontos.size(); i++) {
            System.out.println(pontos.get(i));
        }
    }
}
