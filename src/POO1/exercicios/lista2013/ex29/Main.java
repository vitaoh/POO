package POO1.exercicios.lista2013.ex29;

public class Main {

    public static void main(String[] args) {

        Lampada lampada = new Lampada(false, 40);

        lampada.setWatts(40);
        System.out.println("É econômica: " + lampada.ehEconômica());

        lampada.setEstado(true);
        System.out.println("Está ligada: " + true);
    }
}
