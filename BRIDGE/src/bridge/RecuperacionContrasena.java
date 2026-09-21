package bridge;

public class RecuperacionContrasena extends Notificacion {

    private String codigoRecuperacion;

    public RecuperacionContrasena(
            CanalEnvio canal,
            String destinatario,
            String codigoRecuperacion) {

        super(canal, destinatario);
        this.codigoRecuperacion = codigoRecuperacion;
    }

    @Override
    protected String crearContenido() {
        return "Tu código de recuperación es "
                + codigoRecuperacion
                + ". Este código vence en 10 minutos.";
    }
}