package POO1.prova.outraRevisao.ex3;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome) {
        super(nome);
    }
    
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        setDepartamento(departamento);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return getNome() + " | " + getDepartamento() + " | " + getSalario();
    }
}
