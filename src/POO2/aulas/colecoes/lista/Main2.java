package POO2.aulas.colecoes.lista;

import POO2.aulas.colecoes.Pessoa;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main2 {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa("João", 21);
        Pessoa p2 = new Pessoa("Pedro", 17);
        Pessoa p3 = new Pessoa("Maria", 32);
        
        List<Pessoa> lista = new ArrayList();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        System.out.println(lista);
        
        Collections.sort(lista);
        System.out.println(lista);
        
        System.out.println( Collections.min(lista));
        System.out.println( Collections.max(lista));
    }

    
}
