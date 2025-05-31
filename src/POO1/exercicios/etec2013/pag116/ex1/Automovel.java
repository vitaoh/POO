package POO1.exercicios.etec2013.pag116.ex1;

public class Automovel extends Veiculo{

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificar os niveis de oleo, pressao dos pneus e sistema de freios");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar os espelhos e os bancos");
    }

    @Override
    public void limpar() {
        System.out.println("Lavar a carroceria e aspirar o interior");
    }
    
    public void mudarOleo() {
        System.out.println("Trocar o óleo do motor do automóvel.");
    }
    
}
