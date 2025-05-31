package POO1.prova.outraRevisao.ex3;

public class Funcionario {
    
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this(nome, 0);
    }
    
    public Funcionario(String nome, double salario) {
        setNome(nome);
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
