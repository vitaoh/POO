package POO2.aulas.colecoes.conjunto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        Set<String> conjunto = new HashSet<>(); // conjunto por tabela
//        Set<String> conjunto = new TreeSet<>(); // conjunto por árvore

        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("azul");
        conjunto.add("verde");
        
        System.out.println(conjunto);
    }
}
        