package POO2.aulas.padroes.design.app;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ExceptionLogTrack {

    public synchronized void adicionarLog(Exception exception) {
        
        salvarLog(exception); // Arquivo (Facade)

        notificarInscritos(exception); // Notificar inscritos (Observer)
    }

    // Padrão Criacional Singleton: Garante a existência de um único objeto de uma classe.
    private static ExceptionLogTrack singleton;

    private ExceptionLogTrack() {
        inscricoes = new ArrayList<>();
    }

    public static ExceptionLogTrack getInstance() {

        if (singleton == null) {
            singleton = new ExceptionLogTrack();
        }

        return singleton;
    }

    // Padrão Estrutural Facade: Esconde a complexidade da composição de objetos. 
    private void salvarLog(Exception exception) {

        File file = new File("./ExceptionLogTrack.txt");
        FileWriter fileWriter;

        try {
            if (file.exists()) {
                fileWriter = new FileWriter(file, true);
            } else {
                fileWriter = new FileWriter(file);
            }

            String log = "\n\n";

            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();

            log += date.toString() + "\n";

            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);

            exception.printStackTrace(printWriter);

            log += printWriter.toString() + "\n";

            fileWriter.write(log);

            fileWriter.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // Padrão Comportamental Observador: Permite a notificação de eventos a observadores.
    private ArrayList<Observador> inscricoes;

    public void adicionarInscricao(Observador observador) {

        if (inscricoes.contains(observador) == false) {
            inscricoes.add(observador);
        }
    }

    public void removerInscricao(Observador observador) {

        if (inscricoes.contains(observador) == true) {
            inscricoes.remove(observador);
        }
    }

    private void notificarInscritos(Exception exception) {

        for (Observador inscrito : inscricoes) {
            inscrito.update(exception);
        }
    }

}
