package POO2.aulas.arquivos;

import java.io.*;


public class Exemplo3 {
    public static void main(String[] args) {
        
        File arq = new File("./Arquivo2.txt");
        
        FileWriter writer;
        
        try {
            
            if( arq.exists() ) {
                writer = new FileWriter( arq, true );
            } else {
                writer = new FileWriter( arq );
            }
                        
            writer.write("\n\nEste é o conteúdo do Arquivo2.txt\n\n");
            writer.close();
            
        } catch( IOException ex ) {
            System.out.println( ex.getMessage() );
        }
        
    }
}