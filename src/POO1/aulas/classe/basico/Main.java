// com o package localizado conseguimos chamar um objeto (função) para alocar espaços economizando codigo
package POO1.aulas.classe.basico;

public class Main {
    public static void main(String[] args) {
        
        // usuario é uma variavel de referencia a um objeto do tipo Pessoa (classe)
        Pessoa usuario;
        // criação (new) do objeto do tipo Pessoa
        // criação de uma instância da classe Pessoa
        usuario = new Pessoa(1.8, 'F');
        
        // pesoIdeal é uma variável de instância
        System.out.println( usuario.pesoIdeal );
        
        Pessoa cliente;
        cliente = new Pessoa(2.0, 'M');
        System.out.println( cliente.pesoIdeal );
        
        // acesso direto aos atributos do objeto presente em usuario
        System.out.println( usuario.altura );
        System.out.println( usuario.sexo ); 
        System.out.println( usuario.pesoIdeal );
        
        usuario.altura = 1.80;
        usuario.sexo = 'M';
        
        cliente.altura = 1.65;
        cliente.sexo = 'F';
        
        // executa o metodo calcularPesoIdela do objeto presente em usuario
        usuario.calcularPesoIdeal();
           
        System.out.println( usuario.pesoIdeal );
        
        cliente.calcularPesoIdeal();
                
        System.out.println( cliente.pesoIdeal );
        
        // erro lógico, na maioria das vezes os atributos de uma classe, logo as variaveis de instancia, deverao ser encapsuladas (ocultas) para manter a integridade segurança do objeto
        cliente.pesoIdeal = -1.0;        
        System.out.println( cliente.pesoIdeal );
    }
}
