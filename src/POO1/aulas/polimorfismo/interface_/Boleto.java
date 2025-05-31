package POO1.aulas.polimorfismo.interface_;

import java.io.Serializable;

public class Boleto implements Pagavel, Serializable{
    
    private String beneficiario;
    private double valorPagar;

    public Boleto(String beneficiario, double valorPagar) {
        setBeneficiario(beneficiario);
        setValor(valorPagar);
    }
    
    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValor(double valorPagar) {
        if (valorPagar >= 0) {
            this.valorPagar = valorPagar;
        }
        else {
            System.out.println("Valor invalido!");
        }
    }
    
    @Override 
    public String getDescricao() {
        return getBeneficiario();
    }
    
    @Override 
    public double getValor() {
        return getValorPagar();
    }
    
}

