package POO2.aulas.excecoes;

public class Vetor {
    private String[] vetor;

    public Vetor() {
        vetor = new String[3];
        vetor[0] = "IFSP";
        vetor[1] = "Araraquara";
        vetor[2] = "SP";
        
    }
    
    public void imprimir0() {
        System.out.println(vetor[0]);
        imprimir1();
    }
    
    public void imprimir1() {
        System.out.println(vetor[1]);
        imprimir2();
    }
    
    public void imprimir2() {
        System.out.println(vetor[2]);
        imprimir3();
    }
    
    public void imprimir3() {
        System.out.println(vetor[3]);
    }
    
}
