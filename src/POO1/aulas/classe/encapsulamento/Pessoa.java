
package POO1.aulas.classe.encapsulamento;

public class Pessoa {
    
    private double altura;
    private char sexo;
    private double pesoIdeal;

    public Pessoa(double a, char s) {
        altura = a;
        sexo = s;
        calcularPesoIdeal();
    }
    
    // método (dinamica) de consulta/acesso ao atributo altura
    public double getAltura () { 
        return altura;
    }
    
    public char getSexo () {
        return sexo;
    }
    
    public double getPesoIdeal () {
        return pesoIdeal;
    }
    
    private void calcularPesoIdeal() {
        
        double resultado = 0.0;
        
        if ( (sexo == 'F') || (sexo == 'f') ) {
            
            resultado = 62.1 * altura - 44.7;
            
        } else if( (sexo == 'M') || (sexo == 'm') ) {
            
            resultado = 72.7 * altura - 58.0;
            
        } else {
            
        }
        
        setPesoIdeal(resultado);
        
    }
    
    // metodo (dinamica) de modificação do atributo altura
    public void setAltura(double a) {
        altura = a;
        calcularPesoIdeal();
    }
    
    public void setSexo(char s) {
        sexo = s;
        calcularPesoIdeal();
    }
    
    private void setPesoIdeal(double p) {
        if( p > 0) {
            pesoIdeal = p;
        }
    }    
    
}
