package POO2.aulas.excecoes;

public class Exemplo1 {
    public static void main(String[] args) {
        
        String[] vetor = new String[5];
        
        vetor[0] = "IFSP";
        
        System.out.println(vetor[0]);
        System.out.println(vetor[0].toLowerCase());
        
//      System.out.println(vetor[1].toLowerCase());     gera a exceção NullPointerException
//      System.out.println(vetor[5]);                   gera a exceção ArrayIndexOutOfBoundException


    }
}
