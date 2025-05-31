package POO1.exercicios.etec2012.pag81.ex2;

public class Conta {

    private String nome;
    private double saldo;
    
    public Conta(String nome, double saldo) {
        setNome(nome);
        setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if(valor > 0) {
            saldo += valor;
        }
    }
    
    public void sacar(double valor) {
        if(valor > 0 && saldo > valor) {
            saldo -= valor;
        }
    }

    public void exibirSaldo() {
        System.out.println("Nome: " + nome);
        System.out.println("Saldo: " + saldo);
    }
}
