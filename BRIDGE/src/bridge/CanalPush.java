package bridge;

public class CanalPush implements CanalEnvio {

    private String tokenAplicacion;

    public CanalPush(String tokenAplicacion) {
        this.tokenAplicacion = tokenAplicacion;
    }

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Canal: PUSH");
        System.out.println("Aplicación: " + tokenAplicacion);
        System.out.println("Dispositivo: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
}