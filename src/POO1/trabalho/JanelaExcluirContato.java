package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaExcluirContato extends JFrame {

    public JanelaExcluirContato(List<Contato> contatos) {
        setTitle("Excluir Contato");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel label = new JLabel("Digite o nome do contato:");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        JTextField nomeField = new JTextField(20);
        nomeField.setFont(new Font("Arial", Font.PLAIN, 14));

        JButton excluirButton = new JButton("Excluir");
        excluirButton.setFont(new Font("Arial", Font.BOLD, 14));
        excluirButton.setBackground(new Color(220, 53, 69));
        excluirButton.setForeground(Color.WHITE);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.setFont(new Font("Arial", Font.BOLD, 14));
        cancelarButton.setBackground(new Color(108, 117, 125));
        cancelarButton.setForeground(Color.WHITE);

        excluirButton.addActionListener(e -> {
            String nomeBusca = nomeField.getText();
            if (nomeBusca.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, insira um nome.", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean removed = contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nomeBusca));
            if (removed) {
                JOptionPane.showMessageDialog(this, "Contato excluído com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Contato não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
            dispose();
        });

        cancelarButton.addActionListener(e -> dispose());

        GroupLayout layout = new GroupLayout(mainPanel);
        mainPanel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(label)
                .addComponent(nomeField)
                .addGroup(
                    layout.createSequentialGroup()
                        .addComponent(excluirButton)
                        .addComponent(cancelarButton)
                )
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(label)
                .addComponent(nomeField)
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(excluirButton)
                        .addComponent(cancelarButton)
                )
        );

        add(mainPanel);
    }
}

