package POO1.aulas.variavel.composta;

import java.util.Arrays;

public class ArrayUniD {
    public static void main(String[] args) {

        // int[] vetor = new int[5];
        int[] vetor;
        vetor = new int[5];
        vetor = new int[25]; // perde a alocação anterior (linha 9)
        
        final int TAMANHO = 5;
        vetor = new int[TAMANHO];
        
        vetor[0] = 5;
        vetor[1] = 3;
        vetor[2] = 1;
        vetor[3] = -2;
        vetor[4] = 10;
        
        System.out.println("vetor[0]: " + vetor[0]);
        
        vetor[4] += 2;
        
        System.out.println("vetor[4]: " + vetor[4]);
        
        System.out.println("\nIndice \t Valor");
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] *= 2;
            System.out.println("  "+ i + "\t   " + vetor[i]);
        }
        

        System.out.println("\nValor");
        for (int v : vetor) { // cópia do valor do vetor (não se altera o vetor)
            System.out.println("  " + v);
        }
        
        System.out.println("\nOperadorArray.soma(vetor): " + OperadorArray.soma(vetor));
        
        OperadorArray.preencher(vetor, 7);
        
        System.out.println("\nValor");
        for(int v : vetor) {
            System.out.println("  " + v);
        }
        
        Arrays.fill(vetor, 2);
        
        System.out.println("\nOperadorArray.soma(vetor): " + OperadorArray.soma(vetor));
        
        System.out.println("\n\n");
        
        Ponto p = new Ponto(22.0, 22.0);
        
        System.out.println(p); // está implícito a chamada do método toString()
        
        Ponto[] pontos = new Ponto[5];
        
        System.out.println(pontos[1]);
        pontos[3] = p; // p e pontos [3] possuem/apontam para o mesmo objeto (referência) da classe Ponto
        
        pontos[3].setX(1);
        pontos[3].setY(1);
        
        System.out.println(p);
        
        pontos[2] = new Ponto(5.0, 5.0);
        
        System.out.println("\n\nIndice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " " + pontos[i]);
        }
        
        Arrays.fill(pontos, new Ponto(0, 0));
        System.out.println("\n\nIndice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " " + pontos[i]);
        }
        
        pontos[1].setX(22);
        System.out.println("\n\nIndice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " " + pontos[i]);
        }
        
        for (int i = 0; i < pontos.length; i++) {
            pontos[i] = new Ponto(0, 0);
        }
        System.out.println("\n\nIndice \t Valor");
        for (int i = 0; i < pontos.length; i++) {
            System.out.println(i + " " + pontos[i]);
        }
    }
}
