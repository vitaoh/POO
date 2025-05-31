package POO1.exercicios.lista2013.ex223;

public class Contador {

    private int valor;

    public Contador() {
        valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int v) {
        valor = v;
    }

    public void incrementar(int i) {
        valor++;
    }

    public void imprimirValor() {
        System.out.println("Valor contador " + valor);
    }


}
