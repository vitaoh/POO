package POO1.prova.outraRevisao.ex5;

public class Carro extends VeiculoBase{

    private int numeroDePortas;
    
    public Carro(String marca) {
        super(marca);
    }

   public Carro(String marca, int numeroDePortas) {
        super(marca);
        setNumeroDePortas(numeroDePortas);
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    @Override
    public String getTipo() {
        return "Carro";
    }

    @Override
    public double getVelocidade() {
        return 200.0;
    }

    
}
