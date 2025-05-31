package POO2.aulas.threads.prodcon;

public class Consumidor implements Runnable {
    
    private Buffer buffer;
    private int delay;

    public Consumidor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("> " + buffer.get());
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
