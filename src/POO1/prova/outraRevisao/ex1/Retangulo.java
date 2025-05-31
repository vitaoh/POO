package POO1.prova.outraRevisao.ex1;

public class Retangulo extends FormaBidimensional implements Forma {

    private double largura;
    private double altura;

    public Retangulo() {
        this("", 0, 0);
    }
    
    public Retangulo(String nomeForma, double largura, double altura) {
        super(nomeForma);
        setAltura(altura);
        setLargura(largura);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return largura * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (largura + altura) * 2;
    }

    @Override
    public String toString() {
        return getNomeForma() + "\nArea: " + calcularArea() + "\nPerimetro: " + calcularPerimetro();
    }
    
}
