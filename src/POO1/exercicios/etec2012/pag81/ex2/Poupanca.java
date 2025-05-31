package POO1.exercicios.etec2012.pag81.ex2;

public class Poupanca extends Conta implements Investimento {

    public Poupanca(String nome, double saldo) {
        super(nome, saldo);
    }
    
    @Override
    public void reajustar(double taxa) {
        if(taxa > 0) {
            double novoSaldo = getSaldo() + (getSaldo() * taxa / 100);
            System.out.println("Reajuste de " + taxa + "%");
            System.out.println("Saldo de R$ " + novoSaldo);
        }
        else System.out.println("Taxa de reajuste invalida");
    }
}
