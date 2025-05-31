package POO2.aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatD extends JanelaChat {

    public JanelaChatD() {
// super(); // esta implicito

        jButtonApagar.addActionListener(new ActionListener() { // criou uma classe interna anonima
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Apagar Mensagem!");
                jTextAreaMensagem.setText("");
                jTextAreaMensagem.requestFocusInWindow();
            }
        });

        jButtonEnviar.addActionListener(new ActionListener() {
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
        });
    }
}
