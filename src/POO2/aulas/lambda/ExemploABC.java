package POO2.aulas.lambda;

public class ExemploABC {
    public static void main(String[] args) {
        
        InterfaceFuncionalA objA = (int a, int b) -> {
            return a * b;
        }; 
        
        System.out.println(objA.metodoA(3, 5));
        
        objA = (a, b) -> {
            a = a + 3;
            b = b + 1;
            return a / b;
        };
        
        System.out.println(objA.metodoA(15, 5));
        
        objA = (a, b) -> a - b;
        
        System.out.println(objA.metodoA(10, 2));
        
        System.out.println("---");
        
        InterfaceFuncionalB objB = (b) -> System.out.println("b = " + b);
       
        objB.metodoB(7);
        
        System.out.println("---");
        
        InterfaceFuncionalC objC = () -> System.out.println("Welcome to lambdas");
        
        objC.metodoC();
        
        ClasseC obj = new ClasseC();
        
        obj.metodo(() -> System.out.println("Hello Lambdas!"));
    }
}

