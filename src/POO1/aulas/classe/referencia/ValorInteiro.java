package POO1.aulas.classe.referencia;

public class ValorInteiro {
    
    // atributo/campo encapsulado
    private int valor;

    public ValorInteiro(int valor) {
        this.valor = valor;
    }
    
    
    public int getValor() {
        // dinamica de acesso ao valor
        return valor;
    }
    
    public void setValor(int valor) {
        // dinâmica de alteração do campo/atributo encapsulado
        this.valor = valor;
    }
}
