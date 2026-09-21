package bridge;

public class AlertaSeguridad extends Notificacion {

    private String tipoAlerta;

    public AlertaSeguridad(
            CanalEnvio canal,
            String destinatario,
            String tipoAlerta) {

        super(canal, destinatario);
        this.tipoAlerta = tipoAlerta;
    }

    @Override
    protected String crearContenido() {
        return "Alerta de seguridad: " + tipoAlerta
                + ". Si no reconoces esta actividad, "
                + "cambia tu contraseña.";
    }
}