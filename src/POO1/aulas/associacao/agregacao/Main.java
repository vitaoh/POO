package POO1.aulas.associacao.agregacao;

public class Main {
    public static void main(String[] args) {
        
        Empresa google = new Empresa("Google Inc.");
        google.mostrarInfo();
    
        Profissional joana = new Profissional("Joana");
        Profissional ricardo = new Profissional("Ricardo");
        
        joana.mostrarInfo();
        ricardo.mostrarInfo();
        
        joana.setEmpresa(google);
        
        joana.mostrarInfo();
    }
}
