package POO1.trabalho;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class JanelaVisualizarContatos extends JFrame {

    public JanelaVisualizarContatos(List<Contato> contatos) {
        setTitle("Visualizar Contatos");
        setSize(500, 400);
        setLocationRelativeTo(null);

        String[] colunas = {"Nome", "Telefone", "E-mail"};
        String[][] dados = contatos.stream()
                .map(c -> new String[]{c.getNome(), c.getTelefone(), c.getEmail()})
                .toArray(String[][]::new);

        JTable tabela = new JTable(dados, colunas);
        add(new JScrollPane(tabela), BorderLayout.CENTER);
    }
}
