package POO1.aulas.classe.metodos.promocao;

public class Main {
    public static void main(String[] args) {
        
        int numero = 25;
        
        double resultado;
        
        resultado = numero;
        
        // promoção do valor inteiro na variável 'numero' para um valor double, sem perda de informação
        resultado = Math.sqrt(numero);
        
        System.out.println("Resultado: " + resultado);
        
    }
}
