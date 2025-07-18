package POO2.aulas.padroes.design.app;

public class Monitor implements Observador { // apresentar as exceções em uma área de texto 

    @Override
    public void update(Exception exception) {
        
    }

    public static void main(String[] args) {
        
        Monitor monitor = new Monitor();
        
        ExceptionLogTrack.getInstance().adicionarInscricao(monitor);
    }

}
