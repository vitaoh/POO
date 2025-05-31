package POO1.prova.revisao.ex2;

public class JogoDaVelha {

    private int[][] tabuleiro = new int[3][3];

    public JogoDaVelha() {
        reiniciar();
    }

    public void reiniciar() {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                tabuleiro[l][c] = -1;
            }
        }
    }

    public void imprimir() {
        System.out.println("Tabuleiro:");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                char aux = ' ';
                switch (tabuleiro[l][c]) {
                    case 0:
                        aux = 'O'; // Jogador O
                        break;
                    case 1:
                        aux = 'X'; // Jogador X
                        break;
                }
                System.out.print(" " + aux + " ");
                if (c < 2) {
                    System.out.print("|"); // Separador entre colunas
                }
            }
            System.out.println(); // Nova linha após cada linha do tabuleiro
            if (l < 2) {
                System.out.println("---|---|---"); // Separador entre linhas
            }
        }
    }

    public boolean jogar(int linha, int coluna, char marcador) {
        linha -= 1; // Ajusta para índice zero
        coluna -= 1; // Ajusta para índice zero

        if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3 || tabuleiro[linha][coluna] != -1) {
            return false; // Jogada inválida
        }

        int aux;
        if (marcador == 'o') {
            aux = 0; // Representação de O
        } else if (marcador == 'x') {
            aux = 1; // Representação de X
        } else {
            return false; // Marcador inválido
        }

        tabuleiro[linha][coluna] = aux;
        return true;
    }

    public int ganhador() {
// Verifica linhas e colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] != -1 && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
                return tabuleiro[i][0]; // Vencedor encontrado
            }
            if (tabuleiro[0][i] != -1 && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
                return tabuleiro[0][i]; // Vencedor encontrado
            }
        }

// Verifica diagonais
        if (tabuleiro[0][0] != -1 && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
            return tabuleiro[0][0];
        }
        if (tabuleiro[0][2] != -1 && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
            return tabuleiro[0][2];
        }

        return -1; // Nenhum vencedor
    }
}
