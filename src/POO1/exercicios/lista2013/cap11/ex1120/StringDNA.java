package POO1.exercicios.lista2013.cap11.ex1120;

import java.awt.BorderLayout;

public class StringDNA {
    
    private String dna;

    public StringDNA(String input) { 
        String dnaT = null;
        for (int i = 0; i < input.length(); i++) {
            char l = input.charAt(i);
            if(l == 'a' || l == 'c' || l == 'g' || l == 't' || 
               l == 'A' || l == 'C' || l == 'G' || l == 'T'   ) {
                dnaT = dnaT + l;
            }
        }
        setDna(dnaT);
    }

    public String getDna() {
        return dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    @Override
    public String toString() {
        return dna;
    }
    
    public char charAt(int i) {
        if(i >= 1 && i <= dna.length()) {
            return dna.charAt(i - 1);
        }
        else {
            System.out.println("Indice incorreto");
            return 'X';
        }
    }
    
    public int length() {
        return dna.length();
    }
    
    public int quantosA() {
        int count = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'a' || dna.charAt(i) == 'A') {
                count = count + 1;
            }
        }
        return count;
    }
    
    public int quantosC() {
        int count = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'c' || dna.charAt(i) == 'C') {
                count = count + 1;
            }
        }
        return count;
    }
    
    public int quantosG() {
        int count = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 'g' || dna.charAt(i) == 'G') {
                count = count + 1;
            }
        }
        return count;
    }
    
    public int quantosT() {
        int count = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == 't' || dna.charAt(i) == 'T') {
                count = count + 1;
            }
        }
        return count;
    }
    
    
}
