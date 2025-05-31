package POO1.aulas.associacao.agregacao;

public class Profissional {
    
    private String nome;
    private Empresa emp;

    public Profissional(String n) {
        setNome(n);
        // emp vale nulo
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String n) {
        nome = n;
    }
    
    public Empresa getEmpresa() {
        return emp;
    }
    
    public void setEmpresa(Empresa e) {
        emp = e;
    }
    
    public void mostrarInfo() {
        if (emp == null) {
            System.out.println(getNome() + " se encontra desempregado(a)");
        } else {
            System.out.println(nome + " trabalha em " + emp.getNome());
        }
    }
    
}
