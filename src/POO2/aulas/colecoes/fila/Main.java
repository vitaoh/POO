package POO2.aulas.colecoes.fila;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.offer("azul");
        fila.offer("branco");
        fila.offer("verde");
        
        System.out.println(fila); 
        
        while (fila.isEmpty() == false){
            // first in, first out (FIFO)
            System.out.println(fila.poll());
            
            
        }
    }
}
