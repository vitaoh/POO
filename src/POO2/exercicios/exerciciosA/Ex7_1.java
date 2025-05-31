package POO2.exercicios.exerciciosA;

public class Ex7_1 {
    static class Conta {
        private int saldo = 1000;

        public synchronized void depositar(int valor) {
            saldo += valor;
        }

        public synchronized void sacar(int valor) {
            if (saldo >= valor) {
                saldo -= valor;
            }
        }

        public int getSaldo() {
            return saldo;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Conta conta = new Conta();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) conta.depositar(10);
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) conta.sacar(5);
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
