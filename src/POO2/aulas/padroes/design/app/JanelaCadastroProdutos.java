package POO2.aulas.padroes.design.app;

public class JanelaCadastroProdutos {

    public static void main(String[] args) {
        try {

        } catch (Exception ex) {
//            ExceptionLogTrack track = ExceptionLogTrack.getInstance();
//            track.addLog(ex);
            
            ExceptionLogTrack.getInstance().adicionarLog(ex);
        }
    }
}
