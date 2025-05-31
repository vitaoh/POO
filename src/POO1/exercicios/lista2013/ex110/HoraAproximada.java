package POO1.exercicios.lista2013.ex110;

public class HoraAproximada {

    private int hora;
    private int minutos;

    public HoraAproximada(int h, int m) {
        hora = h;
        minutos = m;
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setHora(int h) {
        hora = h;
    }

    public void setMinutos(int m) {
        minutos = m;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d", hora, minutos);
    }
}
