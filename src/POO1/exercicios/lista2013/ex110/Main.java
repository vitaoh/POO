package POO1.exercicios.lista2013.ex110;

public class Main {

    public static void main(String[] args) {

        HoraAproximada horario = new HoraAproximada(12, 30);

        System.out.println("Hora atual: " + horario.getHora() + ":" + horario.getMinutos());

        horario.setHora(15);
        horario.setMinutos(30);

        System.out.println("Nova hora: " + horario.toString());

    }
}
