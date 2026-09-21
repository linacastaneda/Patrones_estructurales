package bridge;

public abstract class Notificacion {

    protected CanalEnvio canal;
    protected String destinatario;
    protected String mensaje;

    public Notificacion(CanalEnvio canal, String destinatario) {
        this.canal = canal;
        this.destinatario = destinatario;
    }

    public void enviar() {
        mensaje = crearContenido();
        canal.enviar(destinatario, mensaje);
    }

    public void cambiarCanal(
        CanalEnvio nuevoCanal,
        String nuevoDestinatario) {

    this.canal = nuevoCanal;
    this.destinatario = nuevoDestinatario;
    }

    protected abstract String crearContenido();
}