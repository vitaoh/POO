package POO1.aulas.heranca.vivo;

public class SerVivo {
    
    private boolean move;

    public SerVivo(boolean move) {
        setMove(move);
    }

    public boolean isMove() {
        return move;
    }

    public void setMove(boolean move) {
        this.move = move;
    }
    
    // o modificador de acesso protected é um "meio termo" entre public e 
    // private, permitindo acesso aos membros do pacote e a hierarquia de 
    // herança
    
    protected String definicao() {
        if(isMove()) {
            return "È um ser vivo que se move.";
        }
        else {
            return "È um ser vivo que não se move";
        }
    }
    
    @Override 
    public String toString() {
        return definicao();
    }
}
