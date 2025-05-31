package POO2.aulas.classe.especial.interna;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JanelaChat extends JFrame {

    protected JTextArea jTextAreaHistorico;
    protected JScrollPane jScrollPaneHistorico;
    protected JTextArea jTextAreaMensagem;
    protected JScrollPane jScrollPaneMensagem;
    protected JButton jButtonEnviar;
    protected JButton jButtonApagar;

    public JanelaChat() {

        super("Super Chat"); // titulo da janela

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // operacao de fechamento da janela
        setSize(650, 477); // tamanho da janela em pixels

        setLayout(new FlowLayout()); // disposicao dos componentes graficos

// criacao e adicao do componente JTextArea para historico
        jTextAreaHistorico = new JTextArea();
        jTextAreaHistorico.setColumns(55);
        jTextAreaHistorico.setRows(20);
        jTextAreaHistorico.setLineWrap(true);
        jTextAreaHistorico.setEditable(false);
        jScrollPaneHistorico = new JScrollPane(jTextAreaHistorico);
        jScrollPaneHistorico.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jScrollPaneHistorico);

// criando e adicionando do componente JTextArea para menagem
        jTextAreaMensagem = new JTextArea();
        jTextAreaMensagem.setColumns(39);
        jTextAreaMensagem.setRows(5);
        jTextAreaMensagem.setLineWrap(true);
        jScrollPaneMensagem = new JScrollPane(jTextAreaMensagem);
        jScrollPaneMensagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jScrollPaneMensagem);

// criacao e adicao do componente JButton para apagar
        jButtonApagar = new JButton();
        jButtonApagar.setText("Apagar");
        add(jButtonApagar);

// criacao e adicao do componente JButton para enviar
        jButtonEnviar = new JButton();
        jButtonEnviar.setText("Enviar");
        add(jButtonEnviar);

// visualizar a janela
        setVisible(true);

// para colocar o cursor no JTextArea da mensagem
        jTextAreaMensagem.requestFocusInWindow();

    }

}
