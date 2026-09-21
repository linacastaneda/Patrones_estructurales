package bridge;

public class CanalEmail implements CanalEnvio {

    private String servidorSMTP;

    public CanalEmail(String servidorSMTP) {
        this.servidorSMTP = servidorSMTP;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Canal: EMAIL");
        System.out.println("Servidor SMTP: " + servidorSMTP);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}