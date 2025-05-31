package POO1.exercicios.lista2013.ex919;

public class LampadaDeNatal implements Lampada{
    
    private boolean ligada;
    private Cor cor;
    
    public enum Cor {
        VERMELHO,
        VERDE,
        AZUL,
        AMARELO,
        BRANCO;
    }

    public LampadaDeNatal(Cor cor) {
        this.cor = cor;
    }

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("Lampada de Natal ligada com cor " + cor);
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("Lampada de Natal desligada");
    }

    @Override
    public boolean estaLigada() {
        return ligada;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }
}
