package bridge;

public class CanalWhatsApp implements CanalEnvio {

    private String numeroEmpresa;

    public CanalWhatsApp(String numeroEmpresa) {
        this.numeroEmpresa = numeroEmpresa;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Canal: WHATSAPP");
        System.out.println("Cuenta empresarial: " + numeroEmpresa);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}