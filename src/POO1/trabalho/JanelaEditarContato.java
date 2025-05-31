package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaEditarContato extends JFrame {

    private Contato contatoEncontrado = null; 

    public JanelaEditarContato(List<Contato> contatos) {
        setTitle("Editar Contato");
        setSize(700, 500); 
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10)); 
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        mainPanel.setBackground(new Color(240, 240, 240));

        JLabel titleLabel = new JLabel("Editar Contato");
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 10));

        JPanel searchPanel = new JPanel(new GridBagLayout());
        searchPanel.setBackground(Color.WHITE);
        searchPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Buscar Contato"),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));

        GridBagConstraints gbcSearch = new GridBagConstraints();
        gbcSearch.insets = new Insets(5, 5, 5, 5);

        JLabel searchLabel = new JLabel("Nome do Contato:");
        searchLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JTextField searchField = new JTextField(20);
        searchField.setFont(new Font("SansSerif", Font.PLAIN, 16));

        JButton searchButton = new JButton("Buscar");
        searchButton.setFont(new Font("SansSerif", Font.BOLD, 14));
        searchButton.setBackground(new Color(72, 167, 86));
        searchButton.setForeground(Color.WHITE);

        JLabel searchMessage = new JLabel(" ");
        searchMessage.setFont(new Font("SansSerif", Font.ITALIC, 12));
        searchMessage.setForeground(Color.RED);
        searchMessage.setHorizontalAlignment(SwingConstants.CENTER);

        gbcSearch.gridx = 0;
        gbcSearch.gridy = 0;
        searchPanel.add(searchLabel, gbcSearch);

        gbcSearch.gridx = 1;
        searchPanel.add(searchField, gbcSearch);

        gbcSearch.gridx = 2;
        searchPanel.add(searchButton, gbcSearch);

        gbcSearch.gridx = 0;
        gbcSearch.gridy = 1;
        gbcSearch.gridwidth = 3;
        searchPanel.add(searchMessage, gbcSearch);

        JPanel editPanel = new JPanel(new GridBagLayout());
        editPanel.setBackground(Color.WHITE);
        editPanel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createTitledBorder("Editar Informações"),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));

        GridBagConstraints gbcEdit = new GridBagConstraints();
        gbcEdit.insets = new Insets(10, 10, 10, 10);
        gbcEdit.fill = GridBagConstraints.HORIZONTAL;

        JLabel nomeLabel = new JLabel("Nome:");
        nomeLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JTextField nomeField = new JTextField(20);

        JLabel telefoneLabel = new JLabel("Telefone:");
        telefoneLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JTextField telefoneField = new JTextField(20);

        JLabel emailLabel = new JLabel("E-mail:");
        emailLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));
        JTextField emailField = new JTextField(20);

        JButton saveButton = new JButton("Salvar Alterações");
        saveButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        saveButton.setBackground(new Color(0, 123, 255));
        saveButton.setForeground(Color.WHITE);

        gbcEdit.gridx = 0;
        gbcEdit.gridy = 0;
        editPanel.add(nomeLabel, gbcEdit);
        gbcEdit.gridx = 1;
        editPanel.add(nomeField, gbcEdit);

        gbcEdit.gridy = 1;
        gbcEdit.gridx = 0;
        editPanel.add(telefoneLabel, gbcEdit);
        gbcEdit.gridx = 1;
        editPanel.add(telefoneField, gbcEdit);

        gbcEdit.gridy = 2;
        gbcEdit.gridx = 0;
        editPanel.add(emailLabel, gbcEdit);
        gbcEdit.gridx = 1;
        editPanel.add(emailField, gbcEdit);

        gbcEdit.gridy = 3;
        gbcEdit.gridx = 0;
        gbcEdit.gridwidth = 2;
        gbcEdit.anchor = GridBagConstraints.CENTER;
        editPanel.add(saveButton, gbcEdit);

        nomeField.setEnabled(false);
        telefoneField.setEnabled(false);
        emailField.setEnabled(false);
        saveButton.setEnabled(false);

        mainPanel.add(titleLabel, BorderLayout.NORTH);
        mainPanel.add(searchPanel, BorderLayout.CENTER);
        mainPanel.add(editPanel, BorderLayout.SOUTH);

        add(mainPanel);

        searchButton.addActionListener(e -> {
            String nomeBusca = searchField.getText();
            contatoEncontrado = contatos.stream()
                    .filter(c -> c.getNome().equalsIgnoreCase(nomeBusca))
                    .findFirst()
                    .orElse(null);

            if (contatoEncontrado == null) {
                searchMessage.setText("Contato não encontrado.");
                nomeField.setEnabled(false);
                telefoneField.setEnabled(false);
                emailField.setEnabled(false);
                saveButton.setEnabled(false);
            } else {
                searchMessage.setText(" ");
                nomeField.setText(contatoEncontrado.getNome());
                telefoneField.setText(contatoEncontrado.getTelefone());
                emailField.setText(contatoEncontrado.getEmail());

                nomeField.setEnabled(true);
                telefoneField.setEnabled(true);
                emailField.setEnabled(true);
                saveButton.setEnabled(true);
            }
        });

        saveButton.addActionListener(e -> {
            if (contatoEncontrado != null) {
                contatoEncontrado.setNome(nomeField.getText());
                contatoEncontrado.setTelefone(telefoneField.getText());
                contatoEncontrado.setEmail(emailField.getText());
                JOptionPane.showMessageDialog(this, "Contato editado com sucesso!");
            }
        });
    }
}
