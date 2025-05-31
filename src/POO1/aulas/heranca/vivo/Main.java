package POO1.aulas.heranca.vivo;

public class Main {
    public static void main(String[] args) {
        
        SerVivo sv1 = new SerVivo(true);
        SerVivo sv2 = new SerVivo(false);
        
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println("\n---\n");
        
        Animal jacare = new Animal();
        System.out.println(jacare.isMove());
        System.out.println(jacare);
        System.out.println("\n---\n");
        
        Vegetal iris = new Vegetal("IFSP Araraquara");
        System.out.println(iris.isMove());
        System.out.println(iris);
        System.out.println("\n---\n");
        
        // variavel de superclasse pode receber um objeto de subclasse
        SerVivo sv = iris;
        System.out.println(sv.isMove());
        System.out.println(sv.definicao());
        
        // sv e irs são variáveis diferentes que apontam ("acessam")
        // para o mesmo objeto na memória  
        sv.setMove(true); // a variavel sv so tem acesso direto aos recursos 
        // definidos em SerVivo
        System.out.println(iris.isMove());
    }
}
