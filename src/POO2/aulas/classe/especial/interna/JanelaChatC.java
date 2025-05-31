package POO2.aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatC extends JanelaChat implements ActionListener {

    public JanelaChatC() {
        super();

        jButtonApagar.addActionListener(this); // ele mesmo pois implementa ActionListener
        jButtonEnviar.addActionListener(this);
    }

    private void enviar(ActionEvent ae) {
        if (ae.getActionCommand() == "Enviar") {
            System.out.println("Enviar Mensagem");

            String msg = jTextAreaMensagem.getText();

            if (msg.isEmpty() == false) {
                jTextAreaHistorico.append(msg + "\n");
                jTextAreaMensagem.setText("");
            }

            jTextAreaMensagem.requestFocusInWindow();
        }
    }

    private void apagar(ActionEvent ae) {
        System.out.println("Apagar Mensagem!");
        jTextAreaMensagem.setText("");
        jTextAreaMensagem.requestFocusInWindow();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println(ae.getActionCommand());

        if (ae.getActionCommand() == "Apagar") {
            apagar(ae);
        } else {
            if (ae.getActionCommand() == "Enviar") {
                enviar(ae);
            }
        }
    }

}
