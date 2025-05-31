package POO1.exercicios.lista2013.ex29;

public class Lampada {

    private boolean estado;
    private int watts;

    public Lampada(boolean e, int w) {
        estado = e;
        watts = w;
    }

    public int getWatts() {
        return watts;
    }

    public void setWatts(int w) {
        watts = w;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean e) {
        estado = e;
    }

    public boolean ehEconômica() {
        return watts < 40;
    }
}
