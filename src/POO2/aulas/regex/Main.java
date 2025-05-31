package POO2.aulas.regex;

public class Main {
    public static void main(String[] args) {
        
        String str;
        String regex;
        
        str = "a";
        regex = "a"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "aa";
        regex = "a"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a";
        regex = "[a-z]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "b";
        regex = "[a-z]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "B";
        regex = "[a-z]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "B";
        regex = "[a-zA-Z]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Bb";
        regex = "[a-zA-Z]"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Bb";
        regex = "[a-zA-Z]+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "BbW";
        regex = "[a-zA-Z]+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = "[a-zA-Z]+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "";
        regex = "[a-zA-Z]*"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "BbW";
        regex = "\\w+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "A2541313651";
        regex = "A\\d+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "a2541313651";
        regex = "A\\d+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Neto";
        regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "Popolin   Neto";
        regex = "[A-Z][a-z]+\\s+[A-Z][a-z]+"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        
        str = "55587-111";
        regex = "\\d{5}-\\d{3}"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        
        str = "+55(16)";
        regex = "(\\+\\d{1,})?\\(\\d{2}\\)\\d{4,5}-\\d{4}"; 
        System.out.println( str + " | " + regex + " | " + str.matches(regex) );
        
        str = "akakak    kakakaka    alla";
        str = str.replaceAll("\\s+", " ");
        System.out.println( str );
        
        str = "akakak    kakakaka    alla";   
        String[] vetor = str.split("\\s+");
        for( String s : vetor ) {
            System.out.println( s );
        }
        
    }
}