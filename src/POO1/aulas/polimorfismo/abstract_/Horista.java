package POO1.aulas.polimorfismo.abstract_;

public class Horista extends Empregado {
    
    private int horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, int horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        setHorasTrabalhadas(horasTrabalhadas);
        setValorHora(valorHora);
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        if (horasTrabalhadas >= 0) {
            this.horasTrabalhadas = horasTrabalhadas;   
        }
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if (valorHora > 0) {
            this.valorHora = valorHora;   
        }
    }

    @Override
    public double proventoSemanal() {
        double valor = 0;
        
        if(getHorasTrabalhadas() > 40) {
            valor = 40 * getValorHora();
            valor += ((getHorasTrabalhadas() - 40) * (getValorHora() * 1.5)); 
        }
        else {
            valor = getHorasTrabalhadas() * getValorHora();
        }
        
        return valor;
    }
    
    
    
}
