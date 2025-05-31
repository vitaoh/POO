package POO1.aulas.polimorfismo.abstract_;

public class ComissionadoAssalariado extends Comissionado{

    private double salario; // mensal 

    public ComissionadoAssalariado(String nome, String cpf, int valorVendas, double porcentagem, double salario) {
        super(nome, cpf, valorVendas, porcentagem);
        setSalario(salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;
        }
    }

    @Override
    public double proventoSemanal() {
        return super.proventoSemanal() + (getSalario() / 4);
    }
    
}
