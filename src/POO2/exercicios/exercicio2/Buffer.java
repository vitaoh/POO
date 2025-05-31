package POO2.exercicios.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Integer> buffer;
    private int capacidade;

    public Buffer(int capacidade) {
        this.capacidade = capacidade;
        this.buffer = new ArrayList<>();
    }

    public synchronized void produzir(int valor) throws InterruptedException {
        while (buffer.size() >= capacidade) {
            wait(); 
        }
        buffer.add(valor);
        System.out.println("Produzido: " + valor);
        notifyAll(); 
    }

    public synchronized int consumir() throws InterruptedException {
        while (buffer.isEmpty()) {
            wait(); 
        }
        int valor = buffer.remove(0);
        System.out.println("Consumido: " + valor);
        notifyAll(); 
        return valor;
    }
}

