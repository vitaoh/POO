package POO1.prova.revisao.ex1;

public class Main {
    public static void main(String[] args) {
        
        ObjetoBidimensional[] conjunto = new ObjetoBidimensional[5];
        
        for (ObjetoBidimensional obj : conjunto) {
            System.out.println(obj);
        }
        
        System.out.println("---");
        
        conjunto[0] = new Circulo(new Ponto2D(5, 8),   // A
                                  new Ponto2D(10, 8)); // B
        
        conjunto[0].getPontoB().setX(15);
        conjunto[0].setPontoB(new Ponto2D(15, 8));
        
        Ponto2D a = new Ponto2D(1, 1);
        Ponto2D b = new Ponto2D(8, 5);
        conjunto[3] = new Retangulo(a, b);
        
         for (ObjetoBidimensional obj : conjunto) {
            System.out.println(obj);
        }
    }
}
