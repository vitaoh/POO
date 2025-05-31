package POO1.aulas.classe.modificadores.estatico;

import POO1.aulas.classe.metodos.sobrecarga.Ponto;

public class CalculadorDePontos {
    
    private CalculadorDePontos() {
    
    }
    
    private double valor;
    private static int contador = 0;
    
    public static double calcularDistanciaPontos(Ponto a, Ponto b) {
    
        double resultado;
        resultado = Math.sqrt(Math.pow(a.getX() - b.getX(), 2.0) 
                              + Math.pow((a.getY() - b.getY()), 2.0));
        return resultado;
    }
}
