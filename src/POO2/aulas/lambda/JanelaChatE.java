package POO2.aulas.lambda;

import POO2.aulas.classe.especial.interna.JanelaChat;

public class JanelaChatE extends JanelaChat {

    public JanelaChatE() {
        jButtonApagar.addActionListener((ae) -> {
            System.out.println("Apagar");
            jTextAreaMensagem.setText("");
            jTextAreaMensagem.requestFocusInWindow();
        });
        jButtonEnviar.addActionListener((ae) -> {
            System.out.println("Enviar");
            String msg = jTextAreaMensagem.getText();

            if (msg.isEmpty() == false) {
                jTextAreaHistorico.append(msg + "\n");
                jTextAreaMensagem.setText("");
            }

            jTextAreaMensagem.requestFocusInWindow();
        });
    }

    public static void main(String[] args) {
        JanelaChatE janela = new JanelaChatE();
    }
}
