package POO2.aulas.classe.especial.interna;

public class JanelaChatA extends JanelaChat {

    public JanelaChatA() {
        super(); // criacao da janela

        jButtonApagar.addActionListener(new ApagarMensagem(jTextAreaMensagem));
        jButtonEnviar.addActionListener(new EnviarMensagem(jTextAreaHistorico, jTextAreaMensagem));
    }

}
