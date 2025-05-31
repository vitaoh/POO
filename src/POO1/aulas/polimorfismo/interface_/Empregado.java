package POO1.aulas.polimorfismo.interface_;

public abstract class Empregado implements Pagavel {
    
    private String nome;
    private String cpf;

    public Empregado(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public abstract double proventoSemanal();

    @Override
    public String toString() {
        return "Empregado (" + getNome() + ", "  + proventoSemanal() + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Empregado) {
            
            Empregado aux;
            aux = (Empregado) obj;
            
            return getCpf().equals(aux.getCpf());
        }
        else {
            return false;
        }
    }
    
    // método abstrato assinado na interface Pagavel
    @Override 
    public String getDescricao() {
        return toString();
    }
    
//    na classe Empregado não se tem a obrigação de implementar todos os métodos 
//    abstratos assinados na interface Pagavel pois Empregado é abstrato
//    @Override
//    public double getValor() {
//        return proventoSemanal();
//    }
    
}
    
