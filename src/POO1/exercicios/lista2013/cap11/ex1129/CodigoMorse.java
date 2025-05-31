package POO1.exercicios.lista2013.cap11.ex1129;

public class CodigoMorse {

    private static final char[] ALFABETO = {
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '.', ','
    };

    private static final String[] MORSE = {
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".-.-.-", "--..--"
    };

    public static String paraMorse(String texto) {
        String morse = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toUpperCase(texto.charAt(i));
            
            for (int j = 0; j < ALFABETO.length; j++) {
                if (ALFABETO[j] == c) {
                    morse += MORSE[j] + " ";
                    break;
                }
            }
        }
        
        return morse.trim();
    }
    
    public static String deMorse(String morse) {
        String texto = ""; 
        String[] codigosMorse = morse.split(" ");  
        
        for (String codigo : codigosMorse) {
            boolean encontrado = false;
            
            for (int j = 0; j < MORSE.length; j++) {
                if (MORSE[j].equals(codigo)) {
                    texto += ALFABETO[j];
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                texto += '?';
            }
        }
        
        return texto;
    }
}

