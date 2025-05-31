package POO2.aulas.arquivos;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Exemplo6 {
    public static void main(String[] args) {
        
        Pessoa p1, p2;
        
        try {
            
            FileInputStream arq = new FileInputStream("Arquivo3.ser");
            
            ObjectInputStream stream = new ObjectInputStream(arq);
            
            p1 = (Pessoa) stream.readObject();
            p2 = (Pessoa) stream.readObject();
            
            System.out.println(p1);
            System.out.println(p2);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
