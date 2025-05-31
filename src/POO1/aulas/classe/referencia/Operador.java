package POO1.aulas.classe.referencia;

public class Operador {
    
    // tipos primitivos são passados como cópias em parâmetros
    public void zeraInteiro(int valor) {
        // valor é uma cópia local da variável passada como parâmetro
        System.out.println("zerarInteiro valor: " + valor);
        valor = 0;
        System.out.println("zerarInteiro valor: " + valor);
    }
    
    // tipos referencia sao passados literalmente em parametros de metodos
    public void zeraValorInteiro(ValorInteiro v) {
        System.out.println("v.getVAlor(): " + v.getValor());
        v.setValor(0);
        System.out.println("v.getVAlor(): " + v.getValor());
        
    }
    
}
