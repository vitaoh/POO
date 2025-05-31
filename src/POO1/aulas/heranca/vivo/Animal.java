package POO1.aulas.heranca.vivo;

public class Animal extends SerVivo{
    
    public Animal() {
        super(true);
    }
    
    @Override
    protected String definicao() {
        return "È um animal.";
    }
}
