package POO1.aulas.classe.metodos.coercao;

public class Main {
    public static void main(String[] args) {
        
        double pi;
        
        pi = Math.PI;
        
        int numero;
        
        // coerção do valor double em 'pi' para um valor inteiro para 'numero' com perda de informação
        numero = (int) pi;
        
        System.out.println("int(PI): " + numero);
        System.out.println("float(PI): " + (float) pi);
        System.out.println("double(PI): " + pi);
        
        System.out.println("---");
        
        double numero1 = 3.7;
        int numero2 = (int)numero1;
        
        System.out.println(numero2);
    }
}
