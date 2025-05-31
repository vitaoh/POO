package POO2.aulas.genericos;


public class ClasseB {
    
    public <T> void imprimirVetor(T vetor[]) {
        for (T v : vetor) {
            System.out.println(v);
        }
        System.out.println("\n");
    }
    
    public <E extends Comparable<E>> E maximo(E valor1 , E valor2, E valor3) {
        
        E max = valor1;
        
        if(max.compareTo(valor2) < 0) {
            max = valor2;
        }
        
        if(max.compareTo(valor3) < 0) {
            max = valor3;
        }
        
        return max;
    }
}
