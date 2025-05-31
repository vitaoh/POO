package POO1.exercicios.lista2013.ex233;

public class RestauranteCaseiro {

    private MesaDeRestaurante[] mesas;
    
    public RestauranteCaseiro(int numeroDeMesas, String[] itens, double[] precos) {
        mesas = new MesaDeRestaurante[numeroDeMesas];
        for (int i = 0; i < numeroDeMesas; i++) {
            mesas[i] = new MesaDeRestaurante(itens, precos);
        }
    }

    public void adicionaAoPedido(int numeroDaMesa, String item, int quantidade) {
        if (numeroDaMesa >= 0 && numeroDaMesa < mesas.length) {
            mesas[numeroDaMesa].adicionaAoPedido(item, quantidade);
        } else {
            System.out.println("Número da mesa inválido.");
        }
    }

    public double calculaTotalMesa(int numeroDaMesa) {
        if (numeroDaMesa >= 0 && numeroDaMesa < mesas.length) {
            return mesas[numeroDaMesa].calculaTotal();
        } else {
            System.out.println("Número da mesa inválido.");
            return 0.0;
        }
    }

    public void zeraPedidosMesa(int numeroDaMesa) {
        if (numeroDaMesa >= 0 && numeroDaMesa < mesas.length) {
            mesas[numeroDaMesa].zeraPedidos();
        } else {
            System.out.println("Número da mesa inválido.");
        }
    }
}



