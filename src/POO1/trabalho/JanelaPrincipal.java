package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaPrincipal extends JFrame {

    private List<Contato> contatos = new ArrayList<>();

    public JanelaPrincipal() {
        setTitle("Agenda de Contatos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opções");

        JMenuItem menuAdicionar = new JMenuItem("Adicionar Contato");
        JMenuItem menuEditar = new JMenuItem("Editar Contato");
        JMenuItem menuExcluir = new JMenuItem("Excluir Contato");
        JMenuItem menuPesquisar = new JMenuItem("Pesquisar Contato");
        JMenuItem menuVisualizar = new JMenuItem("Visualizar Contatos");

        menuAdicionar.addActionListener(e -> new JanelaAdicionarContato(contatos).setVisible(true));
        menuEditar.addActionListener(e -> new JanelaEditarContato(contatos).setVisible(true));
        menuExcluir.addActionListener(e -> new JanelaExcluirContato(contatos).setVisible(true));
        menuPesquisar.addActionListener(e -> new JanelaPesquisarContato(contatos).setVisible(true));
        menuVisualizar.addActionListener(e -> new JanelaVisualizarContatos(contatos).setVisible(true));

        menu.add(menuAdicionar);
        menu.add(menuEditar);
        menu.add(menuExcluir);
        menu.add(menuPesquisar);
        menu.add(menuVisualizar);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        JLabel labelBemVindo = new JLabel("Bem-vindo à Agenda de Contatos!", SwingConstants.CENTER);
        labelBemVindo.setFont(new Font("Arial", Font.BOLD, 20));
        add(labelBemVindo);
    }
}
