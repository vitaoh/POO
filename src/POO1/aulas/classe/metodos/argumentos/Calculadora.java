package POO1.aulas.classe.metodos.argumentos;

public class Calculadora {
    
    public double somatorio(double... numeros) {
        
        double resultado = 0.0;
        
        for(int i = 0; i < numeros.length; i++) {
           resultado += numeros[i]; 
        }
        
        return resultado;
    }
    
}
