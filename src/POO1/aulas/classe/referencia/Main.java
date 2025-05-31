package POO1.aulas.classe.referencia;

public class Main {
    public static void main(String[] args) {
        
        int var = 13;
        System.out.println("var: " + var);
        
        Operador op = new Operador();
        
        // será passado uma cópia do valor contido em var (tipo primitivo)
        op.zeraInteiro(var);
        System.out.println("var: " + var);
        
        ValorInteiro vInt = new ValorInteiro(15);
        
        System.out.println("vInt getValor(): " + vInt.getValor());
        
        op.zeraValorInteiro(vInt);
    }
}
