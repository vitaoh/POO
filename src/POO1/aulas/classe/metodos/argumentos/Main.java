package POO1.aulas.classe.metodos.argumentos;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        double aux =  calc.somatorio(13.25, 5.0);
        
        System.out.println("aux: " + aux);
        
        double[] vetor = new double[5];
        
        vetor[0] = 11;
        vetor[1] = 10;
        vetor[2] = 5;
        vetor[3] = 2;
        vetor[4] = 0.5;
        
        aux = calc.somatorio(vetor);
        
        System.out.println("aux: " + aux);
        
    }
}
