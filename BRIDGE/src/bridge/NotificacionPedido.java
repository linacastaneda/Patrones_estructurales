package bridge;

public class NotificacionPedido extends Notificacion {

    private String numeroPedido;

    public NotificacionPedido(
            CanalEnvio canal,
            String destinatario,
            String numeroPedido) {

        super(canal, destinatario);
        this.numeroPedido = numeroPedido;
    }

    @Override
    protected String crearContenido() {
        return "Tu pedido " + numeroPedido
                + " fue confirmado y está en preparación.";
    }
}