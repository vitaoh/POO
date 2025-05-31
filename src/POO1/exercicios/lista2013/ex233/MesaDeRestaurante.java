package POO1.exercicios.lista2013.ex233;

public class MesaDeRestaurante {
    
    private String[] itens;
    private int[] quantidades;
    private double[] precos;

    public MesaDeRestaurante(String[] itens, double[] precos) {
        this.itens = itens;
        this.quantidades = new int[itens.length];
        this.precos = precos;
    }

    public void adicionaAoPedido(String item, int quantidade) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i].equals(item)) {
                quantidades[i] += quantidade;
                return;
            }
        }
        System.out.println("Item não encontrado no menu.");
    }

    public void zeraPedidos() {
        for (int i = 0; i < quantidades.length; i++) {
            quantidades[i] = 0;
        }
    }

    public double calculaTotal() {
        double total = 0.0;
        for (int i = 0; i < itens.length; i++) {
            total += quantidades[i] * precos[i];
        }
        return total;
    }
}

