package POO2.aulas.threads.prodcon;

public class Buffer {
    
    private int valor;
    private boolean ocupado;

    public Buffer() {
        valor = -1;
        ocupado = false;
    }
    
    public synchronized void set(int valor) throws Exception {
        
        while(ocupado) {
            System.out.println("Esperando para produzir");
            wait();
        }
        
        this.valor = valor;
        ocupado = true;
        
        notifyAll();
    }
    
    public synchronized int get() throws Exception {
        
        while(!ocupado) {
            System.out.println("Esperando para consumir");
            wait();
        }
        
        int aux = valor;
        ocupado = false;
        notifyAll();
        
        return aux;
    }
}
