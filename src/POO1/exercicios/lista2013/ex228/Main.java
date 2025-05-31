package POO1.exercicios.lista2013.ex228;

public class Main {
    public static void main(String[] args) {
        
        int num = (int) (Math.random() * 101);
        Lampada lampada = new Lampada();

        for (int i = 0; i < num; i++) {
            lampada.acender();
            lampada.apagar();
        }

        System.out.println(lampada.getNumeroDeVezes());
    }
}
