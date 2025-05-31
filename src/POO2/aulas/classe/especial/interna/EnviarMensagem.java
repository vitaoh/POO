package POO2.aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

public class EnviarMensagem implements ActionListener {

    protected JTextArea jTextAreaHistorico;
    protected JTextArea jTextAreaMensagem;

    public EnviarMensagem(JTextArea jTextAreaHistorico, JTextArea jTextAreaMensagem) {
        this.jTextAreaHistorico = jTextAreaHistorico;
        this.jTextAreaMensagem = jTextAreaMensagem;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("Enviar Mensagem");

        String msg = jTextAreaMensagem.getText();

        if (msg.isEmpty() == false) {
            jTextAreaHistorico.append(msg + "\n");
            jTextAreaMensagem.setText("");
        }

        jTextAreaMensagem.requestFocusInWindow();
    }

}
