package POO1.exercicios.lista2013.ex919;

public class LampadaIncandescente implements Lampada{
    
    private boolean ligada;
    
    @Override
    public void ligar() {
        ligada = true;
        System.out.println("Lampada incandescente ligada");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("Lampada incandescente desligada");
    }

    @Override
    public boolean estaLigada() {
        return ligada;
    }
}
