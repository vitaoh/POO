package POO2.aulas.arquivos;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo2 {
    public static void main(String[] args) {
        
        File arq = new File("./Arquivo1.txt");
        
        FileReader reader;
        
        try {
            
            reader = new FileReader(arq);
            
            while( reader.ready() ) {
                
                char c = (char) reader.read();
                System.out.print( c );
                
            }
            
            reader.close();
            
        } catch( IOException ex ) {
            System.out.println( ex.getMessage() );
        }
        
    }
}