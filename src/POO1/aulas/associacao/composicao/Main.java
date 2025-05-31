package POO1.aulas.associacao.composicao;

public class Main {
    public static void main(String[] args) {
        
        Carro uno = new Carro();
        Carro ferrari = new Carro();
        
        uno.trocarRodaDiantEsq();
        ferrari.trocarRodaDiantEsq();
        
        
        
        uno.getDiantEsq();
        
    }
}
