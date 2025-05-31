package POO1.aulas.classe.modificadores.finalizador;

public class Ponto {
    
    // chamada na construção do objeto, JVM aloca memória
    public Ponto() {
    }
    
    // chamado quando a JVM libera espaços de memória alocados mas nao referenciados
    public void finalize() {
        
    }
}
