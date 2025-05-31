package POO1.aulas.heranca.janela;

import java.awt.Color;
import javax.swing.JFrame;

public class Janela extends JFrame {
    
    public Janela() {
        super("Minha Primeira Janela");
        setSize(350, 350);
        setBackground(Color.yellow);
    }
}
