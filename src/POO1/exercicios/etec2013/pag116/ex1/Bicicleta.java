package POO1.exercicios.etec2013.pag116.ex1;

public class Bicicleta extends Veiculo{

    @Override
    public void listarVerificacoes() {
        System.out.println("Verificar pneus, freios, corrente e guidao");
    }

    @Override
    public void ajustar() {
        System.out.println("Ajustar freios e selim");
    }

    @Override
    public void limpar() {
        System.out.println("Limpar o quadro e as rodas da bicicleta");
    }
    
}
