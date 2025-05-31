package POO1.prova.outraRevisao.ex5;

public abstract class VeiculoBase implements Veiculo {

    private String marca;

    public VeiculoBase(String marca) {
        setMarca(marca);
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
