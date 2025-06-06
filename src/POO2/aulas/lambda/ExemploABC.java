package POO2.aulas.lambda;

public class ExemploABC {
    public static void main(String[] args) {
        
        InterfaceFuncionalA objA = (a, b) -> {
            return a * b;
        }; 
        
        System.out.println(objA.metodoA(3, 5));
    }
}
