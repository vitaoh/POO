package POO1.prova.outraRevisao.ex5;

public class Moto extends VeiculoBase{

    private int cilindradas;

    public Moto(String marca, int cilindradas) {
        super(marca);
        setCilindradas(cilindradas);
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }

    @Override
    public double getVelocidade() {
        return 180.0;
    }
}
