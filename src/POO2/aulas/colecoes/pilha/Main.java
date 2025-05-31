package POO2.aulas.colecoes.pilha;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        
        Stack<String> pilha = new Stack<>();
        
        pilha.push("azul");
        pilha.push("branco");
        pilha.push("verde");
        
        System.out.println(pilha);
        
        while( pilha.empty() == false){
            //last in first out (LIFO)
            System.out.println( pilha.pop());
        }
    }
}
