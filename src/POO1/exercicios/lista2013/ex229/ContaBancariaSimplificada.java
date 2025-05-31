package POO1.exercicios.lista2013.ex229;

public class ContaBancariaSimplificada {
    
    private String titular;
    private double saldo;

    public ContaBancariaSimplificada(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        else {
            return false;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    
}
