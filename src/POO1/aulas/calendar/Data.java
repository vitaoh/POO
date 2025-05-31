package POO1.aulas.calendar;

import java.util.Calendar;

public class Data {
    
    private int dia, mes, ano; 
    
    public Data () {
        Calendar data = Calendar.getInstance();
        
        int dia = data.get( Calendar.DAY_OF_MONTH );
        int mes = data.get( Calendar.MONTH ) + 1;
        int ano = data.get( Calendar.YEAR );
        
            
    }
    
    public void mostrarData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }

}
