package POO1.exercicios.lista2013.ex226;

public class Main {
    public static void main(String[] args) {
        
        Ponto2D ponto1 = new Ponto2D(4, 10);
        Ponto2D ponto2 = new Ponto2D(6, 20);

        Linha2D linha = new Linha2D(ponto1, ponto2);

        linha.imprimirDetalhes();
    }
}
