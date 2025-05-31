package POO2.aulas.classe.especial.interna;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaChatB extends JanelaChat {

    public JanelaChatB() {
        super();
        jButtonApagar.addActionListener(new ApagarMensagem()); // objeto/instância de uma classe interna
        jButtonEnviar.addActionListener(new EnviarMensagem());
    }

    public class ApagarMensagem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            System.out.println("Apagar Mensagem!");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
        }

    }

    public class EnviarMensagem implements ActionListener {

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
}
