package POO2.aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; // é uma interface que funciona, ou seja, dispõe de somente um metodo sendo este actionPerformed
import javax.swing.JTextArea;

public class ApagarMensagem implements ActionListener {

    private JTextArea jTextAreaMensagem;

    public ApagarMensagem(JTextArea jTextAreaMensagem) {
        this.jTextAreaMensagem = jTextAreaMensagem;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Apagar Mensagem!");
        jTextAreaMensagem.setText("");
        jTextAreaMensagem.requestFocusInWindow();
    }

}
