package POO2.aulas.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1 {
    public static void main(String[] args) {
        
        Imprimir pares = new Imprimir(0, 2, 50, 50);
        Imprimir impares = new Imprimir(1, 2, 50, 150);
        
//        pares.run();
//        impares.run();

//        Thread thread1 = new Thread(pares);
//        Thread thread2 = new Thread(impares);
        
//        thread1.start();
//        thread2.start();
        
        ExecutorService executorThreads = Executors.newCachedThreadPool();
        
        executorThreads.execute(pares);
        executorThreads.execute(impares);
        
        // para encerrar threads quando as tarefas forem executadas
        executorThreads.shutdown();
        
        System.out.println("fim do main");
    }
}
