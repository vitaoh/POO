package POO1.aulas.heranca.janela;

import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Janela jl = new Janela();
        
        jl.setBackground(Color.red);
        jl.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jl.setVisible(true);
        jl.repaint();
    }
}
