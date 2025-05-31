package POO2.aulas.classe.especial.anonima;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo {

    public static void main(String[] args) {

        List<Integer> buffer = Collections.synchronizedList(new ArrayList<>());

        Thread prod1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(1250);
                        buffer.add(i);
                        System.out.println("Produzido: " + i);
                        i += 2;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

        });
        
        Thread prod2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (true) {
                    try {
                        Thread.sleep(1500);
                        buffer.add(i);
                        System.out.println("Produzido: " + i);
                        i += 2;
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

        });

        Thread cons = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        Thread.sleep(250);
                        if(buffer.isEmpty() == false) {
                            System.out.println("Consumido: " + buffer.removeFirst());
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }

        });
        
        prod1.start();
        prod2.start();
        cons.start();
    }
}
