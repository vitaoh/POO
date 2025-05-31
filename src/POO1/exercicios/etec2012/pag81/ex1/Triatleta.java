package POO1.exercicios.etec2012.pag81.ex1;

public class Triatleta extends Pessoa implements Ciclista, Corredor, Nadador {

    public Triatleta(String nome) {
        super(nome);
    }
    
    @Override
    public void pedalar() {
        System.out.println(getNome() + " esta pedalando");
    }

    @Override
    public void correr() {
        System.out.println(getNome() + " esta correndo");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " esta nadando");
    }
    
}
