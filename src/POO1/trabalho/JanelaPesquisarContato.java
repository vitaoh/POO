package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaPesquisarContato extends JFrame {

    public JanelaPesquisarContato(List<Contato> contatos) {
        setTitle("Pesquisar Contato");
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new BorderLayout());
        JTextField pesquisaField = new JTextField();
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        JButton pesquisarButton = new JButton("Pesquisar");

        panel.add(new JLabel("Digite o nome ou telefone:"), BorderLayout.NORTH);
        panel.add(pesquisaField, BorderLayout.CENTER);
        panel.add(pesquisarButton, BorderLayout.EAST);
        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(resultadoArea), BorderLayout.CENTER);

        pesquisarButton.addActionListener(e -> {
            String pesquisa = pesquisaField.getText();
            StringBuilder resultados = new StringBuilder();
            contatos.stream()
                    .filter(c -> c.getNome().contains(pesquisa) || c.getTelefone().contains(pesquisa))
                    .forEach(c -> resultados.append(c).append("\n"));
            resultadoArea.setText(resultados.toString());
        });
    }
}
