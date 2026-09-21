package bridge;

public class CanalSMS implements CanalEnvio {

    private String proveedorSMS;

    public CanalSMS(String proveedorSMS) {
        this.proveedorSMS = proveedorSMS;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Canal: SMS");
        System.out.println("Proveedor: " + proveedorSMS);
        System.out.println("Destinatario: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}