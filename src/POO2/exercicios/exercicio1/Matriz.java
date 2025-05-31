package POO2.exercicios.exercicio1;

public class Matriz {

    private double[][] matriz;
    private int tamanho;

    public Matriz(double valorInicial, int tamanho) {
        if (tamanho != 2 && tamanho != 3) {
            System.out.println("Tamanho de matriz invalido!");
        } else {
            this.tamanho = tamanho;
            matriz = new double[tamanho][tamanho];
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    matriz[i][j] = valorInicial;
                }
            }
        }
    }

    public Matriz(int tamanho) {
        this(0.0, tamanho);
    }

    public double getElemento(int l, int c) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
            return 0;
        } else {
            return matriz[l][c];
        }
    }

    public void setElemento(int l, int c, double valor) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
        } else {
            matriz[l][c] = valor;
        }
    }

    public void adicionarAMatriz(int l, int c, double valor) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] = matriz[i][j] + valor;
                }
            }
        }
    }

    public void subtrairAMatriz(int l, int c, double valor) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] = matriz[i][j] - valor;
                }
            }
        }
    }

    public void dividirAMatriz(int l, int c, double valor) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] = matriz[i][j] / valor;
                }
            }
        }
    }

    public void multiplicarAMatriz(int l, int c, double valor) {
        if (l < 0 || 2 < l || c < 0 || c < 2) {
            System.out.println("Linha ou coluna invalido!");
        } else {
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matriz[i][j] = matriz[i][j] * valor;
                }
            }
        }
    }

    public double maiorValor() {
        double valor = matriz[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] > valor) {
                    valor = matriz[i][j];
                }
            }
        }
        return valor;
    }

    public double menorValor() {
        double valor = matriz[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matriz[i][j] < valor) {
                    valor = matriz[i][j];
                }
            }
        }
        return valor;
    }

    public double determinanteMatriz() {
        double valor = 0;
        if (tamanho == 2) {
            valor = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } else if (tamanho == 3) {
            valor
                    = matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                    - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                    + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
        }
        return valor;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                resultado += String.format("%6.2f ", matriz[i][j]);
            }
            resultado += "\n";
        }
        return resultado;
    }

}
