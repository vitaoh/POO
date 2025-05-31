package POO1.aulas.associacao.agregacao;

public class Empresa {
    
    private String nome;

    public Empresa(String n) {
        setNome(n);
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public void mostrarInfo() {
        System.out.println( getNome() );
    }
    
}











































