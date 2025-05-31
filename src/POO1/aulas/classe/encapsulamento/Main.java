
package POO1.aulas.classe.encapsulamento;

public class Main {
    public static void main(String[] args) {
        
        Pessoa usuario = new Pessoa( 1.8, 'M' );
        
        // variavel local de tipo primitivo (double)
        double aux1 = usuario.getAltura();
        char aux2 = usuario.getSexo();
        
        System.out.println("Altura: " + usuario.getAltura());
        System.out.println("Sexo: " + usuario.getSexo());
        System.out.println("Peso ideal: " + usuario.getPesoIdeal() );
        
        System.out.println("---------");
        
        // altura é um atributo privado, não é possivel acessar o mesmo diretamente
        // usuario.altura = 1.85;
        usuario.setAltura(aux1 * 1.05);
        
        System.out.println("Altura: " + usuario.getAltura());
        
        usuario.setSexo('F');
        System.out.println("Peso ideal se (F): " + usuario.getSexo());
        
        System.out.println("Peso ideal: " + usuario.getPesoIdeal());
        
        // get = obter
        // set = setar
        
    }
}
