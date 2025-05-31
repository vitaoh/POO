package POO1.aulas.variavel.composta;

public class ArrayMultiD {
    public static void main(String[] args) {
        
        int[][] b = new int[2][2];
        
        b[0] = new int[5]; // primeira linha terá 5 colunas (0 até 4)
        
        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        System.out.println(b[0][3]);
        System.out.println(b[0][4]);
        
        b[1] = new int[3];
        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
        System.out.println(b[1][2]);
//        System.out.println(b[1][3]); // erro de out of bounds
        
        System.out.println("b.length " + b.length);
        System.out.println("b[0].length " + b[0].length);
        System.out.println("b[1].length " + b[1].length + "\n");
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " \t ");
            }
            System.out.println("");
        }
        
        System.out.println("---");
        
        int[][][] matriz3D = new int[4][6][3];
        
        matriz3D[3][0][0] = 256;
        matriz3D[2][5][1] = 1024;
        
        for (int i = 0; i < matriz3D[0][0].length; i++) {
            System.out.print("Camada I: " + i + "\n");
            for (int j = 0; j < matriz3D.length; j++) {
                for (int k = 0; k < matriz3D[0].length; k++) {
                    System.out.print(matriz3D[j][k][i] + " \t ");
                }
                System.out.println("\n");
            }
            
            System.out.println("\n\n");
        }
    }
}
