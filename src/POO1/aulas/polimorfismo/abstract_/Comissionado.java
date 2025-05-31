package POO1.aulas.polimorfismo.abstract_;

public class Comissionado extends Empregado{
    
    private double valorVendas;
    private double porcentagem;

    public Comissionado(String nome, String cpf, double valorVendas, double porcentagem) {
        super(nome, cpf);
        setValorVendas(valorVendas);
        setPorcentagem(porcentagem);
    }
    
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas > 0) {
            this.valorVendas = valorVendas;
        }
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        if (porcentagem >= 0 && porcentagem <= 100) {
            this.porcentagem = porcentagem;
        }
    }

    @Override
    public double proventoSemanal() {
        return getValorVendas() * (getPorcentagem() / 100);
    }
    
}
