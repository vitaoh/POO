package POO2.aulas.rede;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    public static void main(String[] args) throws Exception {

        String ip = "10.105.68.25";
        int porta = 12345;
        InetAddress endereco = InetAddress.getByName(ip);

        ServerSocket servidor = new ServerSocket(porta, 2, endereco);

        System.out.println("Servidor Inicializado: " + servidor);

        Socket conexao;
        System.out.println("Esperando Conexão.");
        conexao = servidor.accept();
        System.out.println("Conexão realizada com sucesso: " + conexao);

        ObjectOutputStream output = new ObjectOutputStream(conexao.getOutputStream());
        ObjectInputStream input = new ObjectInputStream(conexao.getInputStream());
        output.flush();

        String mensagem;
        mensagem = "Olá Cliente!";
        output.writeObject(mensagem);
        output.flush();
        System.out.println("Mensagem enviada: " + mensagem);
        mensagem = (String) input.readObject();
        System.out.println("Mensagem recebida: " + mensagem);

        input.close();
        output.close();
        conexao.close();
    }
}
