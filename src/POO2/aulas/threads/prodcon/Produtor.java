package POO2.aulas.threads.prodcon;

public class Produtor implements Runnable {
    
    private Buffer buffer;
    private int delay;

    public Produtor(Buffer buffer, int delay) {
        this.buffer = buffer;
        this.delay = delay;
    }
    
    @Override
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                buffer.set(i);
                Thread.sleep(delay);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    
}
