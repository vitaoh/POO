
package POO1.aulas.calendar;

import java.util.Calendar;
//import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        
        //getInstance
        Calendar data = Calendar.getInstance();
        
        int dia = data.get( Calendar.DAY_OF_MONTH );
        int mes = data.get( Calendar.MONTH ) + 1;
        int ano = data.get( Calendar.YEAR );
        
        System.out.printf( "%tc\n", data );                
        System.out.printf( "%tF\n", data );
        System.out.printf( "%tA\n", data );
    }
}
