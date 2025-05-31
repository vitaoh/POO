package POO1.aulas.classe.basico;

public class Pessoa {
    
    // atributos 
    public double altura;
    public char sexo;
    public double pesoIdeal;
    
    // construtor padrão (se não existir o JVM cria), aloca memŕoia para os atributos
    /*public Pessoa() {
        System.out.println("Execução do construtor da classe Pessoa.");
    }*/
    
    // construtor personalizado, inicializaçao de atributos por passagem de paramentros
    public Pessoa(double a, char s) {
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
    
    // métodos (operações)
    public void calcularPesoIdeal() {
        
        if ( (sexo == 'F') || (sexo == 'f') ) {
            
            pesoIdeal = 62.1 * altura - 44.7;
            
        } else if( (sexo == 'M') || (sexo == 'm') ) {
            
            pesoIdeal = 72.7 * altura - 58.0;
            
        } else {
            
        }
        
    }
}
