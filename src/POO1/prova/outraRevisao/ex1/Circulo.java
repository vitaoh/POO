package POO1.prova.outraRevisao.ex1;

public class Circulo extends FormaBidimensional implements Forma {

    private double raio;
    
    public Circulo() {
        this("", 0);
    }
    
    public Circulo(String nomeForma, double raio) {
        super(nomeForma);
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        return getNomeForma() + "\nArea: " + calcularArea() + "\nPerimetro: " + calcularPerimetro();
    }

}
