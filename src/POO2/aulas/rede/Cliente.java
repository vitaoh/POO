package POO2.aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {

    public static void main(String[] args) throws Exception {

        String ip = "10.105.68.25";
        int porta = 12345;
        InetAddress endereco = InetAddress.getByName(ip);

        try (Socket conexao = new Socket(endereco, porta)) {
            System.out.println("Conexao realizada com sucesso: " + conexao);
            
            ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
            output.flush();
            
            String mensagem;
            mensagem = (String) input.readObject();
            System.out.println("Mensagem recebida: " + mensagem);
            output.flush();
            mensagem = "Olá Servidor!";
            output.writeObject(mensagem);
            System.out.println("Mensagem envida: " + mensagem);
            
            input.close();
            output.close();
            conexao.close();
        }

    }
}
