package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaAdicionarContato extends JFrame{

    public JanelaAdicionarContato(List<Contato> contatos) {
        setTitle("Adicionar Contato");
        setSize(500, 350);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Adicionar Novo Contato");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 22));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridBagLayout());
        formPanel.setBorder(BorderFactory.createTitledBorder("Dados do Contato"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField nomeField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField telefoneField = new JTextField(20);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        JTextField emailField = new JTextField(20);

        JButton salvarButton = new JButton("Salvar Contato");
        salvarButton.setFont(new Font("Arial", Font.BOLD, 16));
        salvarButton.setBackground(new Color(72, 167, 86));
        salvarButton.setForeground(Color.WHITE);

        gbc.gridx = 0;
        gbc.gridy = 0;
        formPanel.add(nomeLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(nomeField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        formPanel.add(telefoneLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(telefoneField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        formPanel.add(emailLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(emailField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        formPanel.add(salvarButton, gbc);

        panel.add(formPanel, BorderLayout.CENTER);

        JLabel footerLabel = new JLabel("Preencha todos os campos para salvar o contato.");
        footerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        footerLabel.setFont(new Font("Arial", Font.ITALIC, 12));
        panel.add(footerLabel, BorderLayout.SOUTH);

        add(panel);

        salvarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String telefone = telefoneField.getText();
            String email = emailField.getText();

            if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                contatos.add(new Contato(nome, telefone, email));
                JOptionPane.showMessageDialog(this, "Contato adicionado com sucesso!");
                dispose();
            }
        });
    }
}
